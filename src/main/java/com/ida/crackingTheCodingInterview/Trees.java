package com.ida.crackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;

//TODO: unfinished
/*
 * A Binary Search Tree (BST), tt, is a binary tree that is either empty or satisfies the following three conditions:

Each element in the left subtree of tt is less than or equal to the root element of tt (i.e., max(leftTree(t).value)≤t.valuemax(leftTree(t).value)≤t.value).
Each element in the right subtree of tt is greater than the root element of tt (i.e., max(rightTree(t).value)>t.valuemax(rightTree(t).value)>t.value).
Both leftTree(t)leftTree(t) and rightTree(t)rightTree(t) are BSTs.
 */
public class Trees {

	public static void main(String[] args) {
		/*
		 * Node first = new Node(); first.data = 2; boolean res1 =
		 * checkBST(first); System.out.println(res1);
		 */

		Node second1 = new Node();
		second1.data = 3;
		Node second2 = new Node();
		second2.data = 2;
		second1.left = second2;
		Node second3 = new Node();
		second3.data = 5;
		second1.right = second3;
		/*
		 * Node second4 = new Node(); second4.data = 4; second2.left = second4;
		 * Node second5 = new Node(); second5.data = 5; second2.right = second5;
		 */

		boolean res2 = checkBST(second1);
		System.out.println(res2);
	}

	/*static Set<Integer> set = new HashSet<Integer>();

	static boolean checkBST(Node root) {
		// A binary tree is not a binary search if there are duplicate values

		set.add(root.data);
		return (checkLeft(root) && checkRight(root));
	}

	static boolean checkRight(Node root) {
		boolean ret = true;
		while (root.right != null) {
			if (!set.contains(root.right.data)) {
				if (root.data < root.right.data) {
					ret = ret && checkLeft(root.right) && checkRight(root.right);
					break;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return ret;
	}

	static boolean checkLeft(Node root) {
		boolean ret = true;
		while (root.left != null) {
			if (!set.contains(root.left.data)) {
				if (root.data > root.left.data) {
					ret = ret && checkLeft(root.left) && checkRight(root.left);
					break;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return ret;
	}*/

	static boolean checkBST(Node root) {
		return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	static boolean check(Node n, int min, int max) {
		if (n == null)
			return true;
		if (n.data <= min || n.data >= max)
			return false;
		return check(n.left, min, n.data) && check(n.right, n.data, max);
	}
}

class Node {
	int data;
	Node left;
	Node right;
}

package com.ida.crackingTheCodingInterview;

public class TreesFromSomeoneElse {

	public class Solution {
		boolean checkBST(Node root) {
			if (root == null) {
				return true;
			}

			return check(root).bst;
		}

		Result check(Node node) {
			int min = node.data;
			int max = node.data;

			if (node.left != null) {
				Result leftResult = check(node.left);
				if (!leftResult.bst || leftResult.max >= node.data) {
					return new Result(false, 0, 0);
				}
				min = leftResult.min;
			}
			if (node.right != null) {
				Result rightResult = check(node.right);
				if (!rightResult.bst || rightResult.min <= node.data) {
					return new Result(false, 0, 0);
				}
				max = rightResult.max;
			}

			return new Result(true, min, max);
		}
	}

	
}

class Result {
	boolean bst;
	int min;
	int max;

	Result(boolean bst, int min, int max) {
		this.bst = bst;
		this.min = min;
		this.max = max;
	}
}
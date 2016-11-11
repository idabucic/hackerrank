package com.ida.crackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;

//https://www.hackerrank.com/challenges/ctci-linked-list-cycle

public class LinkedListsDetectACycle {
	boolean hasCycle(Node head) {
		boolean res = false;
		if (head == null) {
			res = false;
		} else {
			Set<Node> set = new HashSet<Node>();
			while (head != null) {
				Node next = head.next;
				if (set.contains(next)) {
					res = true;
					break;
				} else {
					set.add(next);
					head = next;
				}
			}

		}
		return res;
	}

	public static void main(String[] args) {
		Node n = new Node();
	}
}

class Node {
	int data;
	Node next;
}
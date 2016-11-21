package com.ida.crackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;

//https://www.hackerrank.com/challenges/ctci-linked-list-cycle

public class LinkedListsDetectACycle {
	boolean hasCycle(ListNode head) {
		boolean res = false;
		if (head == null) {
			res = false;
		} else {
			Set<ListNode> set = new HashSet<ListNode>();
			while (head != null) {
				ListNode next = head.next;
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
		ListNode n = new ListNode();
	}
}

class ListNode {
	int data;
	ListNode next;
}
package com.ida.thirtyDaysOfCode.day24;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-linked-list-deletion
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class Solution {
	public static Node removeDuplicates(Node head) {
		// Write your code here
		if (head != null) {
			if (head.next != null) {
				Node start = head;
				int temp = start.data;
				while (start.next != null) {
					if (temp != start.next.data) {
						temp = start.next.data;
						start = start.next;
					} else {
						Node tempNode = start;
						while (start.next != null && temp == start.next.data) {
							start = start.next;
						}
						tempNode.next = start.next;
					}
				}
			}
		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;

			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}

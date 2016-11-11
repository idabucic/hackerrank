package com.ida.crackingTheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

public class Queues {
	public static void main(String[] args) {
		
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}

class MyQueue<T> {
	Stack<T> addingStack = new Stack<T>();
	Stack<T> removingAndPrintingStack = new Stack<T>();

	public void enqueue(T nextInt) {
		addingStack.push(nextInt);
	}

	public T peek() {
		if (!addingStack.isEmpty()) {
			for (int i = 0; i<addingStack.size(); i++) {
				T x = addingStack.pop();
				removingAndPrintingStack.push(x);
			}
			T ret = removingAndPrintingStack.peek();
			for (int i = 0; i < removingAndPrintingStack.size(); i++) {
				addingStack.push(removingAndPrintingStack.pop());
			}
			return ret;
		}
		return null;
	}

	public void dequeue() {
		if (!addingStack.isEmpty()) {
			for (int i = 0; i<addingStack.size(); i++) {
				T x = addingStack.pop();
				removingAndPrintingStack.push(x);
			}
			removingAndPrintingStack.pop();
			for (int i = 0; i < removingAndPrintingStack.size(); i++) {
				addingStack.push(removingAndPrintingStack.pop());
			}
		}
	}
}

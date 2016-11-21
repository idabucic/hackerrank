package com.ida.crackingTheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
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

//too slow
/*class MyQueue<T> {
	Stack<T> addingStack = new Stack<T>();
	Stack<T> removingAndPrintingStack = new Stack<T>();

	public void enqueue(T nextInt) {
		addingStack.push(nextInt);
	}

	public T peek() {
		while (!addingStack.isEmpty()) {
			removingAndPrintingStack.push(addingStack.pop());
		}
		T ret = removingAndPrintingStack.peek();
		while (!removingAndPrintingStack.isEmpty()) {
			addingStack.push(removingAndPrintingStack.pop());
		}
		return ret;
	}

	public void dequeue() {
		while (!addingStack.isEmpty()) {
			removingAndPrintingStack.push(addingStack.pop());
		}
		removingAndPrintingStack.pop();
		while (!removingAndPrintingStack.isEmpty()) {
			addingStack.push(removingAndPrintingStack.pop());
		}

	}
}*/

class MyQueue<T> {
	Stack<T> stackNewestOnTop = new Stack<T>();
	Stack<T> stackOldestOnTop = new Stack<T>();

	public void enqueue(T value) { // Push onto newest stack
		stackNewestOnTop.push(value);
	}

	public T peek() {
		prepOld();
		return stackOldestOnTop.peek();
	}

	public T dequeue() {

		prepOld();
		return stackOldestOnTop.pop();

	}

	public void prepOld() {
		if (stackOldestOnTop.isEmpty())
			while (!stackNewestOnTop.isEmpty())
				stackOldestOnTop.push(stackNewestOnTop.pop());
	}
}

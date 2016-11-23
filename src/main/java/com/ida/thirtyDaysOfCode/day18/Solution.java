package com.ida.thirtyDaysOfCode.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/30-queues-stacks
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

	Stack<Character> stack = new Stack<Character>();
	List<Character> queue = new ArrayList<Character>();

	private Object popCharacter() {
		Character c = stack.pop();
		return c;
	}

	private Object dequeueCharacter() {
		Character c = queue.get(0);
		queue.remove(0);
		return c;
	}

	private void enqueueCharacter(char c) {
		queue.add(c);
	}

	private void pushCharacter(char c) {
		stack.push(c);

	}
}

package com.ida.crackingTheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/ctci-balanced-brackets
public class StacksBalancedBrackets {
	public static boolean isBalanced(String expression) {
		boolean res = false;
		Stack<Character> s = new Stack<Character>();
		if (!expression.isEmpty()) {
			s.push(expression.charAt(0));

			for (int i = 1; i < expression.length(); i++) {
				if (!s.isEmpty()) {
					char top = (char) s.peek();
					if ((top == '{' && expression.charAt(i) == '}') || (top == '[' && expression.charAt(i) == ']')
							|| (top == '(' && expression.charAt(i) == ')')) {
						s.pop();
					} else {
						s.push(expression.charAt(i));
					}
				} else {
					s.push(expression.charAt(i));
				}
			}
		}
		if (expression.length() > 0 && s.isEmpty()) {
			res = true;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

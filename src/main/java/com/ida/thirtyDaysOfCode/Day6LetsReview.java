package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-review-loop
public class Day6LetsReview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			String string = sc.next();
			printOddAndEven(string);
		}
	}

	private static void printOddAndEven(String string) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for (int i = 0; i<string.length(); i++) {
			if (i == 0 || i%2==0) {
				even.append(string.charAt(i));
			} else {
				odd.append(string.charAt(i));
			}
		}
		System.out.println(even.toString() + " " + odd.toString());
		
	}

}

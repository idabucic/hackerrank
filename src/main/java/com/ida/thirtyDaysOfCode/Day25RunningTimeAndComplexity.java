package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity
public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer n = s.nextInt();
		for (int i = 0; i < n; i++) {
			testIfPrime(s.nextInt());
		}
	}

	private static void testIfPrime(int n) {
		if (n==1) {
			System.out.println("Not prime");
		}
		else if ( n == 2 || n == 3) {
			System.out.println("Prime");
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.println("Not prime");
					return;
				}
			}
			System.out.println("Prime");
		}
	}
}

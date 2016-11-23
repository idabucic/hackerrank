package com.ida.thirtyDaysOfCode;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-more-exceptions

class Calculator {

	public int power(int n, int p) {
		if (n >= 0 && p >= 0) {
			return (int) Math.pow(n, p);
		} else {
			throw new IllegalArgumentException("n and p should be non-negative");
		}
	}

}

public class Day17MoreExceptions {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}

package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-recursion
public class Day9Recursion {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         *  Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int f = factorial(N);
		System.out.println(f);
		s.close();
    }
	
	public static int factorial (int N) {
		while (N>1) {
			return N * factorial(N - 1);
		}
		return 1;
	}
}

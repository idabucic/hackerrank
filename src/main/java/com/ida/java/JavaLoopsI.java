package com.ida.java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-loops-i
public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
	}

}

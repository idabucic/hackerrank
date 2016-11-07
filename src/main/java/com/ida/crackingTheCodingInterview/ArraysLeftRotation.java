package com.ida.crackingTheCodingInterview;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation
public class ArraysLeftRotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] source = new int[n];
		for (int i = 0; i<n; i++) {
			source[(i+n-d)%n] = scan.nextInt();
		}		
		
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + " ");
		}
		scan.close();
	}
}

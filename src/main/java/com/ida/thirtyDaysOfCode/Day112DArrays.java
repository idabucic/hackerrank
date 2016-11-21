package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

public class Day112DArrays {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		// A will be in the inclusive range of -9 to 9
		//so we must not initialize max with 0, but with 7*(-9)
		//which is the lowest possible value for the sum  
		int max = -63;
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1]
						+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				max = max > sum ? max : sum;
			}
		}
		System.out.println(max);
		in.close();

	}
}

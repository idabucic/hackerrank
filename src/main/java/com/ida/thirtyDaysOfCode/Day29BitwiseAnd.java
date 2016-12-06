package com.ida.thirtyDaysOfCode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://www.hackerrank.com/challenges/30-bitwise-and
public class Day29BitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			calculateMaxSumSmallerThenK(sc.nextInt(), sc.nextInt());
		}
		sc.close();
	}

	private static void calculateMaxSumSmallerThenK(int n, int k) {
		// TODO Auto-generated method stub
		Set<Integer> sumSet = new HashSet<Integer>();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				sumSet.add(i & j);
			}
		}
		int max = sumSet.stream()
				.filter( x -> x < k)
				.max(Comparator.naturalOrder()).get();
		System.out.println(max);
	}

}

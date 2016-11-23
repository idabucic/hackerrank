package com.ida.thirtyDaysOfCode.day19;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-interfaces
	
interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum = 1;
		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {
				sum += i;
			}
		}
		if (n>1) {
			sum += n;
		}
		return sum;
	}
	
}
public class Day19Interfaces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}

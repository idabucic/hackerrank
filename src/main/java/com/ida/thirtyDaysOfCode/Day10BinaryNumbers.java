package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer n = s.nextInt();
		String bs = Integer.toBinaryString(n);
		int max = 0;
		int count = 0;
		for (int i = 0; i<bs.length(); i++) {
			if (bs.charAt(i) == '1') {
				count++; 
			} else {
				max = max > count ? max : count;
				count = 0;
			}
		}
		//if binary representation ends with a '1', we need to check one last time
		max = max > count ? max : count;
		System.out.println(max);
		s.close();
		
	}
	
}

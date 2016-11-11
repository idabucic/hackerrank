package com.ida.java;

import java.util.Arrays;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
public class JavaStdinAndStdoutI {
	
	// you must read  integers from stdin and then print them to stdout. 
	//Each integer must be printed on a new line.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scannedInts = new int[3];
		for  (int i = 0; i<3; i++) {
			scannedInts[i] = scanner.nextInt();
		
		}
		scanner.close();
		
		Arrays.stream(scannedInts).forEach(System.out::println);
		
	}
}

package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-hello-world
public class Day0HelloWorld {

	public static void main(String[] args) {
		//To complete this challenge, you must save a line of input from stdin to a variable, 
		//print Hello, World. on a single line, and finally print the value of your variable on a second line.
		
		Scanner scanner = new Scanner(System.in);
		String inputVariable = scanner.nextLine();
		scanner.close();
		System.out.println("Hello, World.");
		System.out.println(inputVariable);
	}

}

package com.ida.java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-end-of-file
public class JavaEndOfFile {

	//The challenge here is to read  lines of input 
	//until you reach EOF, then number and print all  lines of content.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; scan.hasNext(); i++) {
			System.out.println(i + " " + scan.nextLine());
		}
		//Ctrl + Z to send end of file to console
	}

}

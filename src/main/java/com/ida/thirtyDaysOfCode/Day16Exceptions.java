package com.ida.thirtyDaysOfCode;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
public class Day16Exceptions {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        try {
	        	int i = Integer.parseInt(S);
	        	System.out.println(i);
	        //NumberFormatException
	        } catch (Exception e) {
	        	System.out.println("Bad String");
	        }
	 }
}

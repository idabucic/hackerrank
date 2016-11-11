package com.ida.java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout
public class JavaStdinAndStdoutII {
	
	// you must read  integer, double, String 
	// On the first line, print String
	// On the second line, print Double
	//On the third line, print Int
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter(System.getProperty("line.separator"));
        	int i = Integer.valueOf(scanner.nextLine()).intValue();
        	double d = Double.valueOf(scanner.nextLine()).doubleValue();
        	String st = scanner.nextLine();
        	
        scanner.close();
        	
        System.out.println("String: " + st);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
		
		
		
		
	}
}

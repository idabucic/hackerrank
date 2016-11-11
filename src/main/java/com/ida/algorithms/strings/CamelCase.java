package com.ida.algorithms.strings;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/camelcase
public class CamelCase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for (int i = 0; i<s.length(); i++) {
        	if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        		count++;
        	}
        }
        System.out.println(count);
        in.close();
    }
}

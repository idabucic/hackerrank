package com.ida.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){
        // Complete this function
		
		if (s.equals("")) return "Empty String";
		if (s.length() == 1) return s;
		if (containsDoubles(s)) {
			String reduced = removeOneDouble(s);
			return super_reduced_string(reduced);
		} else {
			return s;
		}
		
				
    }

	static boolean containsDoubles(String s) {
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				return true;
			}
		}
		return false;
	}
	
	static String removeOneDouble(String s) {
		String result = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				if (i==0) {
					result = s.substring(2);
					break;
				} else if (i+2 < s.length()){
					result = s.substring(0, i) + s.substring(i+2);
					break;
				} else {
					result = s.substring(0, i);
					break;
				}
			}
		}
		return result;
		
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

package com.ida.crackingTheCodingInterview;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/ctci-making-anagrams
public class StringsMakingAnagrams {
	public static int numberNeeded(String first, String second) {
		int sumToRemove = 0;
		int[] firstArray = new int[26];
		int[] secondArray = new int[26];
		for (int i = 0; i < first.length(); i++) {
			firstArray[first.charAt(i) - 'a']++;
		}
		for (int i = 0; i < second.length(); i++) {
			secondArray[second.charAt(i) - 'a']++;
		}
		// System.out.println(Arrays.toString(firstArray));
		// System.out.println(Arrays.toString(secondArray));

		for (int i = 0; i < 26; i++) {
			sumToRemove += Math.abs(firstArray[i] - secondArray[i]);
		}
		return sumToRemove;
	}
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        in.close();
	        System.out.println(numberNeeded(a, b));
	    }

}

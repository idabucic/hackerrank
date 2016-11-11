package com.ida.thirtyDaysOfCode;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-arrays
public class Day7Arrays {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        in.close();
	        StringBuilder sb = new StringBuilder();
	        for (int i = n - 1; i>=0; i--) {
	        	sb.append(arr[i]);
	        	sb.append(" ");
	        }
	        System.out.println(sb.toString().trim());
	        
	       
	 }
}

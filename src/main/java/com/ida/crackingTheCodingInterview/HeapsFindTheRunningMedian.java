package com.ida.crackingTheCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

public class HeapsFindTheRunningMedian {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            printMedian(a);
        }
    }

	private static void printMedian(int[] a) {
		if (a.length==1) {
			System.out.println(a[0]);
		} else {
			Arrays.sort(a);
			int i =  (int)a.length/2;
			if (a.length%2==1) {
				//odd
				System.out.printf("%.1f", i);
			} else {
				//even
				float res = (float)(a[i-1] + a[i])/2;
				System.out.println(res);
			}
		}
		 
	}
}

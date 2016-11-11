package com.ida.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        //a<s<t<b so I can skip apples that fall to the left and oranges that fall to the right
        int applesOnTheHouse = 0;
        for (int i=0; i<m; i++) {
        	if (apple[i] > 0 && (a + apple[i] >= s && a + apple[i] <= t)) {
        		applesOnTheHouse++;
        	}
        }
        int orangesOnTheHouse = 0;
        for (int i=0; i<n; i++) {
        	if (orange[i] < 0 && (b + orange[i] >= s && b + orange[i] <= t)) {
        		orangesOnTheHouse++;
        	}
        }
        System.out.println(applesOnTheHouse);
        System.out.println(orangesOnTheHouse);
    }
}

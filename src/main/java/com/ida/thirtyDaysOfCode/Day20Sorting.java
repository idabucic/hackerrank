package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

public class Day20Sorting {
	static int bubbleSort(int a[], int n) {
		int numberOfSwaps = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		return numberOfSwaps;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++ ) {
			array[i] = sc.nextInt();
		}
		int swaps = bubbleSort(array, n);
		System.out.println("Array is sorted in " + swaps + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[n-1]);
		sc.close();
	}
}

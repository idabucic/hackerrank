package com.ida.thirtyDaysOfCode.day21;

public class Solution {

	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
	
	public static<T> void printArray(T[] array) {
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

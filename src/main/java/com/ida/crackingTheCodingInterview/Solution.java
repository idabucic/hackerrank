package com.ida.crackingTheCodingInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//Hash Tables: Ransom Note
//https://www.hackerrank.com/challenges/ctci-ransom-note
public class Solution {
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String magazine;
    String note;
    
    public Solution(String magazine, String note) {
        this.magazine = magazine;
        this.note = note;
    }
    
    public boolean solve(int magazineNum, int noteNum) {
    	if (noteNum > magazineNum) {
    		return false;
    	}
    	boolean result = true;
    	String [] magazineWords = magazine.split(" ");
    	String [] noteWords = note.split(" ");
//    	System.out.println(Arrays.toString(magazineWords));
//    	System.out.println(Arrays.toString(noteWords));
    	magazineMap = new HashMap<String, Integer>();
    	noteMap = new HashMap<String, Integer>();
    	for (int i = 0; i< magazineWords.length; i++) {
    		if (magazineMap.containsKey(magazineWords[i])) {
    			Integer num = magazineMap.get(magazineWords[i]) + 1;
    			magazineMap.put(magazineWords[i], num);
    		} else {
    			magazineMap.put(magazineWords[i], 1);
    		}
    		
    	}
    	for (int i = 0; i < noteWords.length; i++) {
    		if (noteMap.containsKey(noteWords[i])) {
    			Integer num = noteMap.get(noteWords[i]) + 1;
    			noteMap.put(noteWords[i], num);
    		} else {
    			noteMap.put(noteWords[i], 1);
    		}
    	}
//    	magazineMap.entrySet().forEach(x -> System.out.print(x.getKey() + ":" + x.getValue() + " "));
//    	noteMap.entrySet().forEach(x -> System.out.print(x.getKey() + ":" + x.getValue() + " "));
    	Iterator<Entry<String, Integer>> iterator = noteMap.entrySet().iterator();
    	while (iterator.hasNext()) {
    		String key = iterator.next().getKey();
    		if (!(magazineMap.containsKey(key) && magazineMap.get(key)>= noteMap.get(key))) {
    			result = false;
    			break;
    		}
    	}
    	
    	
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve(m, n);
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

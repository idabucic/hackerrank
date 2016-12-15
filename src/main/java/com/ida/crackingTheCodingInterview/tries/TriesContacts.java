package com.ida.crackingTheCodingInterview.tries;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/ctci-contacts/
//https://www.youtube.com/watch?v=vlYZb68kAY0

class Trie {
	Map<Character, Trie> letters = new HashMap<Character, Trie>();
	int numberOfChildren;

	void add(String s) {
		numberOfChildren++;

		if (!s.isEmpty()) {
			char first = s.charAt(0);
			if (!letters.containsKey(first)) {
				//if there is no letter first in the map, add it
				letters.put(first, new Trie());
			}
			//if there is first letter in the map, get that trie
			//and try to add the next letter
			letters.get(first).add(s.substring(1));
		}
	}
	int countWords(String prefix) {
		char first = prefix.charAt(0);
		if (letters.containsKey(first)) {
			 return letters.get(first).countWords(prefix.substring(1)) + 1;
		} else {
			return 0;
		}
	}

	int count(String s) {
		if (s.isEmpty()) {
			return numberOfChildren;
		}

		char first = s.charAt(0);
		return letters.containsKey(first) ? letters.get(first).count(s.substring(1)) : 0;
	}
}
public class TriesContacts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Trie trie = new Trie();
		for (int a0 = 0; a0 < n; a0++) {
			String op = sc.next();
			String word = sc.next();
			if (op.equals("add")) {
				trie.add(word);
			} else if (op.equals("find")) {
				System.out.println(trie.count(word));
				
			}
		}
	}
}

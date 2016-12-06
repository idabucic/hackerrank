package com.ida.thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegexPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Pattern p = Pattern.compile("[a-z]+@gmail\\.com$");
		List<String> users = new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			String username = sc.next();
			String email = sc.next();
			Matcher m = p.matcher(email);
			if (m.find()) {
				users.add(username);
			}
		}
		users.stream().sorted().forEach(System.out::println);
		sc.close();
	}

	

}

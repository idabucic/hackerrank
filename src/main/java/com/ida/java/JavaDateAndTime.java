package com.ida.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-date-and-time
public class JavaDateAndTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*String month = in.next();
		String day = in.next();
		String year = in.next();
		LocalDate ld = LocalDate.of(
				Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));*/
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		LocalDate ld = LocalDate.of(year, month, day);
		DayOfWeek d = ld.getDayOfWeek();
		System.out.println(d);
		
	}

}

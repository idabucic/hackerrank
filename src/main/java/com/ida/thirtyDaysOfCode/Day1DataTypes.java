package com.ida.thirtyDaysOfCode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-data-types
public class Day1DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		System.out.println(Locale.getDefault());
		//doesn't work on system.in without setting the locale
		//DecimalFormat newFormat = new DecimalFormat(".#");
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		int x = i + Integer.valueOf(scan.nextLine()).intValue();
		double w = Double.valueOf(scan.nextLine());
//		String y = nf.format(w + d);
		String y = String.format(Locale.US, "%.1f", (w+d));
		String z = s + scan.nextLine();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		scan.close();
	}

}

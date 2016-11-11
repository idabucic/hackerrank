package com.ida.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-currency-formatter
public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat nfus = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nfus.format(payment);
		NumberFormat nfindia = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		String india = nfindia.format(payment);
		NumberFormat nfchina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nfchina.format(payment);
		NumberFormat nffrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nffrance.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}

}

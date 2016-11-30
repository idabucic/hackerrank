package com.ida.thirtyDaysOfCode;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-nested-logic
//not suitable to be solved with LocalDate and Period
public class Day26NestedLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rd = sc.nextInt();
		int rm = sc.nextInt();
		int ry = sc.nextInt();
		int ed = sc.nextInt();
		int em = sc.nextInt();
		int ey = sc.nextInt();

		int fine = 0;
		if (ry - ey > 0) {
			fine = 10000;
		} else if (ry == ey && rm - em > 0) {
			fine = 500 * (rm - em);
		} else if (rm == em && rd - ed > 0) {
			fine = 15 * (rd - ed);
		}

		System.out.println(fine);
		sc.close();

	}

}

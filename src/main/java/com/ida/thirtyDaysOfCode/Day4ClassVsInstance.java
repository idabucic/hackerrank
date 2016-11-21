package com.ida.thirtyDaysOfCode;

import java.util.Scanner;

class PersonDay4 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonDay4(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		} else {
			this.age = initialAge;
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the
		// correct statement:
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}

}
//https://www.hackerrank.com/challenges/30-class-vs-instance
public class Day4ClassVsInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			PersonDay4 p = new PersonDay4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

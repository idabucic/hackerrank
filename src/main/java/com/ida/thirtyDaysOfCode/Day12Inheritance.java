package com.ida.thirtyDaysOfCode;

import java.util.*;

class PersonDay12 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	PersonDay12(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends PersonDay12 {
	private int[] testScores;

	Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}

	public char calculate() {
		int sum = 0;
		char res = 'T';
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		int avg = (Integer) (sum / testScores.length);

		if (avg >= 90 && avg <= 100) {
			res = 'O';
		} else if (avg >= 80 && avg < 90) {
			res = 'E';
		} else if (avg >= 70 && avg < 80) {
			res = 'A';
		} else if (avg >= 55 && avg < 70) {
			res = 'P';
		} else if (avg >= 40 && avg < 55) {
			res = 'D';
		}
		return res;
	}

}

public class Day12Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());

	}

}

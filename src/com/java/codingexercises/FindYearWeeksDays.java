package com.java.codingexercises;

import java.util.Scanner;

public class FindYearWeeksDays {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the NumberOfDays: ");
		int numberOfDays = scan.nextInt();
		
		int years = numberOfDays/365;
		int remainingDays = numberOfDays-(years * 365);
		int weeks = remainingDays/7;
		int days = remainingDays-(weeks * 7);
		
		System.out.println(years+" years "+weeks+" weeks "+days+" days");
		scan.close();

	}
}

package com.java.codingexercises;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+"Not a leap year");
		}
		scan.close();
	}
}
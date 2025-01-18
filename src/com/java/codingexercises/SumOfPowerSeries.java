package com.java.codingexercises;

import java.util.Scanner;

public class SumOfPowerSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input the base number (x)
		System.out.println("Enter the number (x): ");
		int num = sc.nextInt();

		// Input the number of terms
		System.out.println("Enter the number of terms: ");
		int terms = sc.nextInt();

		int sum = 0;
		int power = 1;
		for (int i = 1; i <= terms; i++) {
			power *= num * num;

			if (i % 2 == 0) {
				sum -= power;
			} else {
				sum += power;
			}
		}
		// Output the result
		System.out.println("The sum of the series is: " + sum);
		sc.close();
	}
}

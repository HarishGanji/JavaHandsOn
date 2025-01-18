package com.java.codingexercises;

import java.util.Scanner;

//S = a2 + a2 / 2 + a2 / 3 + …… + a2 / 10
public class PowerSeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a: ");
		int a = sc.nextInt();
		System.out.println("Enter the terms: ");
		int terms = sc.nextInt();

		double sum = 0;
		int square = 2;
		for (int i = 1; i <= terms; i++) {
			int power = 1;
			for (int j = 0; j < square; j++) {
				power *= a;
			}
			sum += (double) power / i;
		}
		System.out.println(sum);
		sc.close();
	}

}

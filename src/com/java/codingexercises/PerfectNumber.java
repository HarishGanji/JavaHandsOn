package com.java.codingexercises;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum+=i;
			}
		}
		if (sum == number) {
			System.out.println(number + ", is perfect Number");
		} else {
			System.out.println("Not a perfect Number");
		}

		scan.close();
	}
}
//6, 28, 496, 8128, 33550336, 8589869056, 137438691328,
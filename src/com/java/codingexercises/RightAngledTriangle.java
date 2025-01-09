package com.java.codingexercises;

import java.util.Scanner;

public class RightAngledTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			if (i < number - 1) {
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int k = 0; k < number; k++) {
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
		sc.close();

	}
}

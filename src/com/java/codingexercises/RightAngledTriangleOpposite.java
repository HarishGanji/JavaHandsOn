package com.java.codingexercises;

import java.util.Scanner;

public class RightAngledTriangleOpposite {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int spaces = 4;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			spaces--;
			System.out.println();
		}
		sc.close();
	}
}

package com.java.codingexercises;

import java.util.Scanner;

public class TwoRightAngledTriangle {
	public static void rightAngledTriangle(int number) {
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		rightAngledTriangle(number);
		rightAngledTriangle(number);
		sc.close();
	}

}

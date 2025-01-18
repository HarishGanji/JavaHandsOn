package com.java.codingexercises;

import java.util.Scanner;

public class InvertedRightAngledTriangleNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int printNum = number;
		for (int i = 0; i < number; i++) {
			for (int l = 0; l < i; l++) {
				System.out.print("  ");
			}
			for (int j = 0; j < printNum; j++) {
				System.out.print(printNum + " ");
			}
			printNum--;
			System.out.println();
		}
		sc.close();
	}
}

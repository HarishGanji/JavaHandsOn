package com.java.codingexercises;

import java.util.Scanner;

public class InvertedRightAngledTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size you want to print triangle: ");
		int a = scan.nextInt();
		System.out.println();
		for (int i = a; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}

//* * * * * * 
//* * * * *
//* * * * 
//* * *
//* *
//*
package com.java.codingexercises;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for(int j = 0; j<=i ;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

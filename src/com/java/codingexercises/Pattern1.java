package com.java.codingexercises;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int column = sc.nextInt();
		
		for(int i = 0; i<row;i++) {
			for(int j = 0; j<column;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}

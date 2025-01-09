package com.java.codingexercises;

import java.util.Scanner;

public class Denominations {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount: ");

		int number = scan.nextInt();

		int Denomination500 = 0;
		int Denomination50 = 0;
		int Denomination10 = 0;
		int Denomination1 = 0;

		if (number >= 500) {
			Denomination500 = number / 500;
			number = (number - (500 * Denomination500));
		}

		if (number >= 50) {
			Denomination50 = number / 50;
			number = (number - (50 * Denomination50));
		}

		if (number >= 10) {
			Denomination10 = number / 10;
			number = (number - (10 * Denomination10));
		}

		if (number >= 1) {
			Denomination1 = number / 1;
		}
		
		System.out.println("500's:"+Denomination500+" 50's:"+Denomination50+" 10's:"+Denomination10+" 1's:"+Denomination1);
		scan.close();
		
//		package com.java.codingexercises;
//
//		import java.util.Scanner;
//
//		public class Denominations {
//		    public static void main(String[] args) {
//		        Scanner scan = new Scanner(System.in);
//		        System.out.println("Enter the amount: ");
//
//		        int amount = scan.nextInt();
//		        if (amount < 0) {
//		            System.out.println("Invalid input. Please enter a non-negative amount.");
//		            scan.close();
//		            return;
//		        }
//
//		        // Define available denominations
//		        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};
//		        int[] counts = new int[denominations.length];
//
//		        // Calculate denominations
//		        for (int i = 0; i < denominations.length; i++) {
//		            counts[i] = amount / denominations[i];
//		            amount %= denominations[i];
//		        }
//
//		        // Display the results
//		        System.out.println("Denominations:");
//		        for (int i = 0; i < denominations.length; i++) {
//		            if (counts[i] > 0) {
//		                System.out.println(denominations[i] + "'s: " + counts[i]);
//		            }
//		        }
//
//		        scan.close();
//		    }
//		}

	}
}

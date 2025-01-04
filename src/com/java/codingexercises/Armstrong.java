package com.java.codingexercises;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scan.nextInt();
		
//		if(String.valueOf(number).length()!= 3) {
//			System.out.println("Please Enter exactly three digit number");
//		}
		
		int length = Integer.toString(number).length();
		int armStrong = 0;
		int check = number;
		while(number>0) {
			int extractDigit = number%10;
			int result = 1;
			for(int i = 0; i<length;i++) {
				result *= extractDigit;
			}
			armStrong += result;
			number = number/10;
		}
		if(armStrong == check) {
			System.out.println(check+", is Armstrong number");
		}else {
			System.out.println(check+", is not an Armstrong number");
		}
		scan.close();
	}
}

package com.java.codingexercises;

import java.util.Scanner;

public class SpecialString {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//input Example: NXT1234
		System.out.println("Enter the word:");
		
		String word = scan.nextLine();
		StringBuilder newWord = new StringBuilder();
		
		for(int i = 0; i<word.length();i++) {
			char currentCharacter = word.charAt(i);
			if(Character.isDigit(currentCharacter)) {
				newWord.append(word.charAt(i));
			}
		}
		//String newWord = word.replaceAll("[^0-9]","");
		int number = Integer.parseInt(newWord.toString());
		if(number % 2 ==0 || number % 7 ==0) {
			System.out.println(word+", is a special string");
		}else {
			System.out.println(word+", is not a special string");
		}
		 
		scan.close();
	}
}

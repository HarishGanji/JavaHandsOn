package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveAllByFilter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,44,66,77,99, 55, 6, 4, 4, 8, 8, 9, 9, 7));
		System.out.println("List of elements: " + list);

		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		
		List<Integer> newList = new ArrayList<>();
		newList = list.stream().filter(ele -> ele <= number).collect(Collectors.toList());
		System.out.println(newList);
		scan.close();
	}
}

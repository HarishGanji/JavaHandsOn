package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class FindKthNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Choose the Largest or Smallest: ");
		String option = (scan.nextLine()).toLowerCase();

		System.out.println("Enter the Number: ");
		int number = scan.nextInt();

		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
		Set<Integer> sortedList = listOfIntegers.stream()
				.sorted(option.equals("largest") ? Comparator.reverseOrder() : Comparator.naturalOrder())
				.collect(Collectors.toCollection(LinkedHashSet::new));
		List<Integer> sortedNewList = sortedList.stream().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(sortedNewList.get(number - 1));
		scan.close();
	}
}

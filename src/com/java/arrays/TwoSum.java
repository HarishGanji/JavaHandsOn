package com.java.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Here’s a classic pair sum problem often asked in coding interviews:
//
//Problem Statement:
//Given an array of integers, find all unique pairs of elements that sum up to a specific target value.
//
//Input:
//An array of integers nums[].
//An integer target.
//Output:
//Return a list of pairs (a, b) where a + b = target.
//Constraints:
//Each pair should be unique.
//The same element cannot be used twice.
//Example 1:
//Input:
//nums = [2, 7, 11, 15, -2, 8, 3]
//target = 9
//
//Output:
//[(2, 7), (-2, 11)]
//
//Example 2:

public class TwoSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that you want to fill: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the target you want to check: ");
		int target = sc.nextInt();

		System.out.println("Enter the elements in to array: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		List<String> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] + array[j] == target) {
					result.add("(" + array[i] + ", " + array[j] + ")");
				}
			}
		}

//		result.stream().forEach(System.out::print);
		System.out.println(result);
		sc.close();
	}
}

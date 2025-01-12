package com.java.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashingApproachTwoSum {

	public static void main(String[] args) {
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

		List<String> check = findTwoSum(array, target);
		System.out.println(check);
		sc.close();
	}

	private static List<String> findTwoSum(int[] array, int target) {
		Set<Integer> uniqueData = new HashSet<>();
		List<String> listResult = new ArrayList<>();
		for(int arr:array) {
			int difference = target - arr;
			if(uniqueData.contains(difference)) {
				listResult.add("(" + difference + " ," + arr + ")");
			}
			uniqueData.add(arr);
		}
		return listResult;
	}

}
//Two Sum:
//
//Problem: Given an array of integers, find all unique pairs that sum up to a target value.
//Why Hashing: Hashing allows you to quickly check for the complement of each number in the array in constant time.
//Three Sum:
//
//Problem: Given an array of integers, find all unique triplets that sum up to zero.
//Why Hashing: By fixing one element and using the hashing approach for the remaining two elements, you can solve the problem efficiently.
//Find Duplicates:
//
//Problem: Given an array, find if there are any duplicates.
//Why Hashing: By storing elements in a HashSet as you iterate, you can detect duplicates in linear time.
//Intersection of Two Arrays:
//
//Problem: Given two arrays, find the intersection (common elements).
//Why Hashing: You can store elements from one array in a HashSet, and then check for each element of the second array in constant time.
//Subarray Sum Equals Target:
//
//Problem: Given an array, find a subarray whose sum equals a given target.
//Why Hashing: You can track the cumulative sum and check if a previous sum exists that allows you to form the required subarray sum.
//Checking for Pair with Given Difference:
//
//Problem: Given an array of integers, find all pairs with a specific difference (e.g., target = |a - b|).

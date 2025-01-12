package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Two pointer method
public class TwoSumSecondApproach {
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

		List<String> check = findTwoSum(array, target);
		System.out.println(check);
		sc.close();
	}

	public static List<String> findTwoSum(int[] array, int target) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		List<String> result = new ArrayList<>();
		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == target) {
				result.add("(" + array[left] + " ," + array[right] + ")");
				left++;
				right--;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}
}

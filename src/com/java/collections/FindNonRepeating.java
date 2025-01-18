package com.java.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindNonRepeating {
	public static void main(String args[]) {
		List<Integer> elements = Arrays.asList(5, 1, 2, 4, 3, 1, 5, 2, 6);
		Map<Integer, Integer> nonRepeatingTracking = new LinkedHashMap<>();
		for (int num : elements) {
			if (nonRepeatingTracking.containsKey(num)) {
				int currentCount = nonRepeatingTracking.get(num);
				nonRepeatingTracking.put(num, currentCount + 1);
			} else {
				nonRepeatingTracking.put(num, 1);
			}
		}
		int newList = nonRepeatingTracking.entrySet().stream().filter(ele -> ele.getValue() == 1)
				.map(ele -> ele.getKey()).findFirst().get();
		System.out.println("NonRepeating number is: " + newList);

	}
}

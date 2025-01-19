package com.java.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Group Elements in List by Frequency: Group the elements in a list based on how frequently they occur, returning a map of element to its frequency.
public class GroupBy {
	public static void main(String args[]) {

		List<Integer> listOfIntegers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : listOfIntegers) {
			if (frequencyMap.containsKey(num)) {
				int currentCount = frequencyMap.get(num);
				frequencyMap.put(num, currentCount + 1);
			} else {
				frequencyMap.put(num, 1);
			}
		}
		System.out.println(frequencyMap);

		
		// using streams grouping by
//		Map<Integer, Long> newList = listOfIntegers.stream()
//				.collect(Collectors.groupingBy(num -> num, Collectors.counting()));
//		System.out.println(newList);
	}

}

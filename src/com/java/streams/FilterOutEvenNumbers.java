package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutEvenNumbers {
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,58,96,456,75,6,7,5,4,8,5));
		List<Integer> evenNumbers = integers.stream().filter(ele->ele % 2 == 0).collect(Collectors.toList());
		
		evenNumbers.forEach(System.out::println);
	}
}

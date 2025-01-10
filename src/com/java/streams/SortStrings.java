package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList("raja","sariga","avanthi"));
		List<String> newList = strings.stream().sorted().collect(Collectors.toList());
		newList.forEach(System.out::println);
	}

}

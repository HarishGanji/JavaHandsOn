package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a list of strings, count how many strings start with the letter 'A' (case-insensitive).
public class StartsWith {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList("raja","sariga","Avanthi"));
		Long newList = strings.stream().filter(ele -> ele.toLowerCase().startsWith("a")).count();
		System.out.println(newList);
	}

}

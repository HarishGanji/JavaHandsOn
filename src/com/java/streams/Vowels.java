package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//return the list which contain vowels
public class Vowels {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("Indian", "Arizona", "Fly", "mrp", "prp");
		List<String> newList = list.stream().filter(ele -> {
			List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');
			return ele.toLowerCase().chars().mapToObj(c -> (char) c).anyMatch(characters::contains);
		}).collect(Collectors.toList());

		newList.forEach(System.out::println);

	}
}

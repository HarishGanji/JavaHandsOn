package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, filter out the strings whose length is greater than 4
public class FilterStringsByLength {
	public static void main(String args[]) {
		List<String> strings = new ArrayList<>(Arrays.asList("raja", "sariga", "avanthi", "hrit"));
		List<String> newList = strings.stream().filter(ele -> ele.length() > 4).collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
}

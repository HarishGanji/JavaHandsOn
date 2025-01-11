package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToSquares {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> squares = list.stream().map(ele -> ele * ele).collect(Collectors.toList());
		squares.forEach(System.out::println);
	} 
}

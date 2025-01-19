package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShiftListElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of positions: ");
		int positionNumber = 2;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Enter left or right: ");
		String rotate = (sc.nextLine()).toLowerCase();

		if (rotate.equals("left")) {
			List<Integer> newList = rotateLeft(list, positionNumber);
			System.out.println(newList);
		} else if (rotate.equals("right")) {
			List<Integer> newList = rotateright(list, positionNumber);
			System.out.println(newList);
		}

	}

	public static List<Integer> rotateright(List<Integer> list, int positionNumber) {
		List<Integer> checkList = new ArrayList<>();
		checkList.addAll(list.subList(list.size() - positionNumber, list.size()));
		checkList.addAll(list.subList(0, list.size() - positionNumber));
		return checkList;
	}

	public static List<Integer> rotateLeft(List<Integer> list, int positionNumber) {
		List<Integer> checkList = new ArrayList<>();
		checkList.addAll(list.subList(positionNumber, list.size()));
		checkList.addAll(list.subList(0, positionNumber));
		return checkList;
	}
}

package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Remove All Elements Greater Than a Given Value: Remove all elements in the 
list that are greater than a specific value
*/
public class RemoveAll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 55, 6, 4, 4, 8, 8, 9, 9, 7));
		System.out.println("List of elements: " + list);

		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		Iterator<Integer> iterator = list
				.iterator(); /*
								 * The Iterator was introduced in Java to solve the problem of safe removal of
								 * elements from a collection (like a List, Set, etc.) while iterating over it.
								 * The iterator provides a way to traverse through the elements of a collection
								 * and allows modification (such as removing elements) during iteration, without
								 * running into issues like skipping elements or concurrent modification
								 * exceptions.
								 */
		while (iterator.hasNext()) {
			Integer currentElement = iterator.next();
			if (currentElement > number) {
				iterator.remove();
			}
		}
		System.out.println();
		System.out.println("Result List: " + list);

		scan.close();
	}

}

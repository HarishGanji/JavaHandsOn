package com.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort a List of Objects Based on a Property: Given a list of objects, sort the list by one of the properties of
//the object (e.g., by name, age, or any custom property)
public class Person {
	private String name;
	private int age;
	private String city;

	public Person() {
		super();
	}

	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static void main(String args[]) {
		Person p1 = new Person("Raja", 28, "Hyderabad");
		Person p2 = new Person("Prakash", 50, "Bengaluru");
		Person p4 = new Person("Ratnavel", 25, "Chennai");
		Person p3 = new Person("Ericson", 52, "Kolkata");

		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);

		List<Person> newList = personList.stream().sorted(Comparator.comparing(Person::getAge))// .reveresed
				.collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
}
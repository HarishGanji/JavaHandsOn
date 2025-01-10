package com.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	private int rollNumber;
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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

	@Override
	public String toString() {
		return "Name:" + name + ", Age: " + age + ", RollNumber: " + rollNumber;
	}

}

public class StudentCompareByAge {

	public static void main(String args[]) {

		List<Student> stu = new ArrayList<>();

		Student s1 = new Student();
		s1.setRollNumber(1);
		s1.setName("Rajendra Desai");
		s1.setAge(50);

		Student s2 = new Student();
		s2.setRollNumber(2);
		s2.setName("Charan");
		s2.setAge(20);

		stu.add(s1);
		stu.add(s2);

		List<Student> byAge = stu.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

		byAge.forEach(System.out::println);
	}

}

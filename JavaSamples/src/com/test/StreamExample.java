package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		var listStudents = new ArrayList<>();
		
		var<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

		listStudents.add(new Stud("Alice", 82));
		listStudents.add(new Stud("Bob", 90));
		listStudents.add(new Stud("Carol", 67));
		listStudents.add(new Stud("David", 80));
		listStudents.add(new Stud("Eric", 55));
		listStudents.add(new Stud("Frank", 49));
		listStudents.add(new Stud("Gary", 88));
		listStudents.add(new Stud("Henry", 98));
		listStudents.add(new Stud("Ivan", 66));


		var listGoodStudents = listStudents.stream()
				.filter(s -> ((Stud) s).getScore() >= 70)
				.collect(Collectors.toList());

		listGoodStudents.stream().forEach(System.out::println);



	}
}

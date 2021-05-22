package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * What is a Stream?
 * =================
A stream represents a sequence of elements supporting sequential and parallel aggregate operations. 
Since Java 8, we can generate a stream from a collection, an array or an I/O channel.
Every collection class now has the stream() method that returns a stream of elements in the collections:

Streams vs Collections:
========================
A collection is a data structure that holds elements. Each element is computed before it actually becomes a part of that collection.
On the other hand, a stream is not a data structure. A stream is a pipeline of operations that compute the elements on-demand. 
Though we can create a stream from a collection and apply a number of operations, the original collection doesn’t change. Hence 
streams cannot mutate data.
And a key characteristic of streams is that they can transform data, as operations on a stream can produce another data structure, 
like the map and collect operation as shown in the above examples.


Java Stream
===========

A stream represents a sequence of elements supporting sequential and parallel aggregate operations. Since Java 8, we can generate a stream from a collection, an array or an I/O channel.

Operations can be performed on a stream are categorized into intermediate operations and terminal operations. We’ll see details of these operations shortly

The operations on a stream can be chained together (intermediate operations) and end with a terminal operation. Such a chain of stream operations is called stream pipeline

Stream Pipeline
===============

We can say that a stream is a pipeline of aggregate operations that can be evaluated. A pipeline consists of the following parts:
-> a source: can be a collection, an array or an I/O channel.

-> zero or more intermediate operations which produce new streams, such as filter, map, sorted, etc.
-> a terminal operation that produces a non-stream result such as a primitive value, a collection, or void (such as the forEach operation)

Intermediate Operations:
========================
map()
filter()
sorted()
limit()
distinct()

Terminal Operations:
===================
1. The allMatch() operation
2. The anyMatch() operation
3. The noneMatch() operation
4. The collect() operation
5. The count() operation
6. The forEach() operation
7. The min() operation
8. The max() operation
9. The reduce() operation

Parallel Streams
================
The powerful feature of streams is that stream pipelines may execute either sequentially or in parallel. All collections support the parallelStream() method that returns a possibly parallel stream:

** Stream<Student> parallelStream = listStudents.parallelStream();
** When a stream executes in parallel, the Java runtime divides the stream into multiple sub streams. The aggregate operations iterate over and process these sub streams in parallel and then combine the results.
The advantage of parallel streams is performance increase on large amount of input elements, as the operations are executed currently by multiple threads on a multi-core CPU.

Sequential Stream:
==================
The Collection’s stream() method returns a sequential stream. We can convert a sequential stream to a parallel stream by calling the parallel() method on the current stream. 

The following example shows a stream executes the sorted operation sequentially, and then execute the filter operation in parallel:

listStudents.stream()
        .sorted()
        .parallel()
        .filter(s -> s.getScore() >= 70)
        .forEach(System.out::println);


 */

public class ExplainStream {

	public static void main(String[] args) {

		var<String> listStudents = new ArrayList<>();

		listStudents.add(new Stud("Alice", 82));
		listStudents.add(new Stud("Bob", 90));
		listStudents.add(new Stud("Carol", 67));
		listStudents.add(new Stud("David", 80));
		listStudents.add(new Stud("Eric", 55));
		listStudents.add(new Stud("Frank", 49));
		listStudents.add(new Stud("Gary", 88));
		listStudents.add(new Stud("Henry", 98));
		listStudents.add(new Stud("Ivan", 66));
		listStudents.add(new Stud("John", 52));

		listStudents.stream().forEach(values -> {
			System.out.println();
		});

		List<Object> top3Students = listStudents.stream().filter(s -> ((Stud) s).getScore() >= 70).sorted().limit(3)
				.collect(Collectors.toList());

		System.out.println("Top 3 Students by Score:");
		top3Students.forEach(s -> System.out.println(s));

	}

}

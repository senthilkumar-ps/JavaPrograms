package com.test;

/*
 * An array is an object.
 * Elements in an array are accessed by index (0-based).
 * Advantage of array: very fast access to elements.
 * Disadvantage of array: fixed length, not appropriate if a dynamic container is required.
 * The java.util.Arrays class provides useful utility methods for working with arrays such as filling, searching and sorting.
 * The System.arraycopy() method provides an efficient mechanism for copying elements from one array to another.
 */

public class ExplainArrayExample {
	public static void main(String[] args) {

		int[] numbers = new int[10];
		
		int[] arrayTye2Dec = {1,2,3,4,5};
		/*
		 * All numbers are initialized to zeroes by default. That means the above array
		 * numbers contain 10 numbers which are all zeroes, even we haven’t initialized
		 * the array yet. Boolean elements are initialized to false by default. In Java,
		 * you can place the brackets [] either after the type or after the variable
		 * name. Hence these declarations are both correct
		 */
		String[] names = new String[5];

		names[0] = "senthil";

		for (String name : names) {
			System.out.println("Name is ---> " + name);
		}
	}
}

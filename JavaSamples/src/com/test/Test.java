package com.test;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Test implements InterfaceFunctionInterface {

	void display() {
		
		Collection<String> list = new ArrayList<String>();
		
		list.add("xxx");
		list.add("xxx");
		list.add("xxx");
		list.add("xxx");
		
		list.forEach(System.out::println);
		
		list.forEach(values -> {
			System.out.println("-->" + values);
		});

	}

	class Test1 extends Test {

		@Override
		public int calculateSubraction(int x) {
			// TODO Auto-generated method stub
			return x * x;
		}

	}

	class Main {
		public static void main(String[] args) {
			Test1 t = new Test1();
			t.calculateSubraction(5);
		}

	}
}
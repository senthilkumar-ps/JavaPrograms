package com.test;

public class FunctionlInterfaceTest {

	public static void main(String args[]) {
		
		
		// create anonymous inner class object

		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("New thread created"); }
		 * }).start();
		 */

		
		// lambda expression to create the object
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();
	}
}

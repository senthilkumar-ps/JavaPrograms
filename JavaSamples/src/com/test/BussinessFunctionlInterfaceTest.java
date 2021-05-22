package com.test;

public class BussinessFunctionlInterfaceTest {

	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		InterfaceFunctionInterface s = (int x)->x*x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculateSubraction(a);
		System.out.println(ans);
	}

}

package com.test;

public class NestedClass {
	
	
/*
	 A class is declared within another class is called a nested class. Here’s an example:

public class Car {
 
    class Engine {
     
    }
}


Here, the class Engineis nested within the class Car. Engine is the nested class and Car is the outer class (or enclosing class).
 
2. Why We Use Nested Classes in Java?
Here are the main reasons that motivate us to use nested classes:

- Grouping related code together: some classes are only useful to others, e.g. the Engine class and Car class in the above example. By using nested classes, 
related code is grouped together which gives us more flexibility and controllability in writing code.

- Increasing code encapsulation: consider the above example - the nested class Engine is encapsulated inside the Car class, which protects the Engine class from 
the outside world.

- Making the code more readable and maintainable: Indeed, nested classes help us write more readable and maintainable code, as shown in the above example:
 when reading to the Car class, we can also navigate to the Engine class and make update quickly within the same source file.
	
	
	
	 What is a Static Nested Class in Java?
	 =======================================
			 A nested class is marked with static modifier is called the static nested class. Here’s an example:

			 public class Car {
			  
			     static class Wheel {
			  
			         public void rotate() {
			             System.out.println("The wheel is rotating...");
			         }
			     }  
			 }
			 Here, Wheel is a static nested class which is enclosed in the Car class. The following code illustrates how to instantiate an object of the 
			 static nested class:


			 Car.Wheel wheel = new Car.Wheel();
			 wheel.rotate();

 */
	
}

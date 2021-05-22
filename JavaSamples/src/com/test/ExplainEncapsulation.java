package com.test;

/*
 * encapsulation is a technique that packages related data and behaviors into a single unit
 * creating an interface is also the process of encapsulation
 * 
 * interface Human {
    void eat();
    void talk();
    void think();
   }


Again, in terms of encapsulation, this interface groups the essential behaviors of human-being in a single unit.
Second, encapsulation is a technique for protecting data from misuse by the outside world, which is referred as 
‘information hiding’ or ‘data hiding’.

Why Is Encapsulation?
======================
It’s because encapsulation has a number of advantages that increase the reusability, flexibility and maintainability of the code.

Flexibility: It’s more flexible and easy to change the encapsulated code with new requirements. For example, if the requirement for 
setting the age of a person changes, we can easily update the logic in the setter method setAge().  

Reusability: Encapsulated code can be reused throughout the application or across multiple applications. For example, 
the Person class can be reused whenever such type of object is required.
  
Maintainability: Application ode is encapsulated in separate units (classes, interfaces, methods, setters, getters, etc) so it’s 
easy to change or update a part of the application without affecting other parts, which reduces the time of maintenance.



 */

public class ExplainEncapsulation {

	// In Java, the access modifier privateis used to protect data and behaviors
	// from outside. Let’s modify the Person
	// class above to prevent the attributes name and age from being modified by
	// other objects:

	private String name;
	private int salary;

}

class Main {
	public static void main(String[] args) {
		ExplainEncapsulation e = new ExplainEncapsulation();

		// The code won’t compile because the field name is marked as private.
		e.name = "xxx";

		/*
		 * But what if we want the other objects to be able to read the name and age? In
		 * this case, we provide methods whose name in the form of getXXX() - so called
		 * getters in Java. Hence we add two getters to the Person class: 
		 * 
		 * class Person {
		 * 
		 * private String name; 
		 * private int age;
		 * 
		 * public String getName() { return name; }
		 * 
		 * public String getAge() { return age; } }
		 * 
		 * This is the process of hiding information. The other objects cannot access the data directly. 
		 * Instead, they have to invoke the getters which are designed to protect the data from misuse or unwanted changes.
		   What if we want the outside world to be able to modify our data in a safety manner? In this case, we can 
		   provide methods in the pattern of setXXX() - the so called setters in Java. For example, creating a setter for the field name:

		   public void setName(String name) {
    	   if (name == null || name.equals("")) {
           throw new IllegalArgumentException("name cannot be null or empty!");
          }
           this.name = name;
		}
		 */

	}
}

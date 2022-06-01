package Oop;

class Person{
	
	String name ;
	String email;
	String phone;
	
	void walk(){
	System.out.println(name + "is walking");	
	}
	
	void eat(){
	System.out.println(email);	
		
	}
	
	void sleep() {
	System.out.println(name + "is sleeping");	
		
	}
}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiating an object
		Person person1 = new Person ();
		
		person1.name = "Joe ";
		person1.email = "joe@testemail.com";
		person1.phone = "7897897894";
		
		//Abstaction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		System.out.println("**********************");
		Person person2 = new Person ();
		
		person2.name = "Serah ";
		person2.sleep();
		person2.eat();
		person2.walk();
		
		/*
		//Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		
		//Action, activities, behavoir
		//System.out.println(name + "is walking");
		walking(name);
		System.out.println(name + "is eating");
		
		// What if we want to do this for another person	
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "3213216548";
		
		//Action, activities, behavoir
		//System.out.println(name + "is walking");
		walking(name2);
		System.out.println(name + "is eating");
		
		//What about blinding attributes and properties together ?
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
	System.out.println(name + "is walking");	
	
		*/
		
	}

		
}

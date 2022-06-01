package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		
		//multipleNumbers(numA, numB);
		// Or System.out.println("The product of the two numbers is " + multipleNumbers(numA, numB));
		int product = multipleNumbers(numA, numB);
		System.out.println("The product of the two numbers is " + product);
	}
	
	
	static void printName() {
		
	System.out.println("My name is John");
	}
	
	//Add numbers function
	static void addNumbers(int numberA, int numberB){
		
		int sum = numberA + numberB;
		
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum );	
		
	}
	// Multiplication function
	static int multipleNumbers(int numberC, int numberD){

		int product = numberC*numberD;
		System.out.println("The product of " + numberC + " and " + numberD + " is " + product );
		
		//Calling addNumber function within this function
		addNumbers(product, product);
		// You can also alter this function like this: addNumbers(product + 50, product);
		
		return product;
	}
}

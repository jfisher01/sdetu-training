package basics;

public class SalaryCalculator {

	public static void main(String[] args) {

		// Define and declare variable
		String career = "Software Developer";
		System.out.println("Program is starting");

		System.out.println("My career is:" + career);

		// Declare variables
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;

		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println(
				"My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");

		// Computer our annual salary
		// rate*hoursPerWeek*weeksPerYear

	}
}

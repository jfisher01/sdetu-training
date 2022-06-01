package Oop;

// Inheritance goes with IS A relationship
public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		// Old way of doing this 
		//acc1.accountNumber = "01689453";
		//acc1.name = "Roger Hue";
		//acc1.balance = 10000;
		System.out.println("*****************************");
		
		// New way is called Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("234823423");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "01689453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		// Polymorphism through overridning
		System.out.println(acc1.toString());
		
		
		/*
		// Polymorphism - calling checking and Saving
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount(" Checking Account");
		acc2.accountNumber = "01689453";
		System.out.println("*************************");
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "01689453";
		acc3.checkBalance();
		System.out.println("*********************");
		
		*/
		
		/*
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount ();
		cd1.balance = 3000 ;
		cd1.interestRate = "4.5";
		cd1.name = " Juan";
		cd1.accountType = " CD Account" ;
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/
		
	}

}

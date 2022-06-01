package Oop;

// Initial class
//public class BankAccount {

// Used for practicing implementation 
public class BankAccount implements IRate {
	
	//Define variables
	String accountNumber;
	
	//Static >> belongs to the CLASS not the object instance . 
	//We use static to access CLASS 
	//final >> constant (often static final )
	private static final String routingNumber = "013546";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructors are unique methods
	// 1. They are used to define, set up and initialize properties of an object
	// 2. Constructors are IMPLICITLY called upon instantiation
	// 3.The same name as the class itself
	// 4. Constructors have no return type
	BankAccount(){
	
		System.out.println("New account created");
	}
	
	// Overloading is calling same method name with different arguments
	BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT:" + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accounType, msg are all local variables
		// Local variables only exist within that block of code
		System.out.println("NEW ACCOUNT:" + accountType);
		System.out.println("INITIAL DEPOSIT OF :$" + initDeposit);
		String msg = null;
		
		if(initDeposit < 1000 ) {
			//String errorMsg = "ERROR : Minimum deposit must be at lease $1,000";
			//System.out.println(errorMsg);
		msg	 = "ERROR : Minimum deposit must be at lease $1,000";
		}
		else {
		msg ="Thanks for your initial deposit of : $" + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
		
	// Getters and Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;
	//this.name = "Mr." + name;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	
	
	
	
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}

	void withdraw(double amount) {
	balance = balance + amount;	
		showActivity("WITHDRAW");
	}
	// Private can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION; " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		
		System.out.println("Balance is : " + balance );	
	}
	
	void getStatus() {
		
		
	}
	
	@Override 
	public String toString() {
		
		return  "[ " + "Name: " + name + " ,ACCOUNT # " + accountNumber + " ROUNTING # " +  routingNumber + " , BALANCE: $" + balance + " ] ";
	}
}

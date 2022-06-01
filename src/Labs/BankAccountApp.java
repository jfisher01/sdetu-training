package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
	
		BankAccount acc1 = new BankAccount("605329874", 1000);
		BankAccount acc2 = new BankAccount("215321112",2000);
		BankAccount acc3 = new BankAccount("125320001", 2500);
		BankAccount acc4 = new BankAccount("465325555", 3000);
		
		acc1.setName("Jim");
		System.out.println("*********");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
		
	}	
}

class BankAccount implements IInterest{
    
	//Making encapsulation by making them private so clients cannot see them
	//Static makes this variable belong to the class
	private static int iD = 1000;  // Internal ID for internal ID processing for identifying customers
	private String accountNumber;
    private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance ;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;		
		//System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
private void setAccountNumber() {

	int random = (int) ( Math.random() *100); //to get 2 digit numbers
	System.out.println(random);
	accountNumber = iD + random + SSN.substring(0,2);
	System.out.println("Your account Number : " + accountNumber);
}

public void setName(String name) {
	this.name = name;
}
 public String getName() {
	 return name;
 }
 
 public void payBill(double amount) {
	 balance = balance - amount;
	 System.out.println("Paying bill: " + amount);
	 showBalance();
 }
 
 public void makeDeposit(double amount) {
	 System.out.println("Making deposit: " + amount);
	 balance = balance + amount;
	 showBalance();
 }
 public void showBalance() {
	 System.out.println("Balance : " + balance);
 }
 
 @Override
 public void accrue() {
	 balance = balance*(1 + rate/100);
	 showBalance();
 }
 @Override
 public String toString() {
	 
	 return "[ Name: " + name + " ]\n [ Account Number: " + accountNumber + "]\n" + "[ Routing Number: " + routingNumber + " ]\n" + " [Balance: " + balance + " ]";
 }
}
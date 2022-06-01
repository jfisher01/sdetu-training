package basics;

public class SString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bookTitle;
		bookTitle = "The Lord of the Ring";
		
		if (bookTitle.contains("Ring")){
			
		System.out.println("The book contains the word Ring");
		}
		
		//Using string with dot
		String browser = "Chrome";
		if (browser.equalsIgnoreCase(browser)) {
			
			//System.out.println();
			System.out.println("The browser is Chrome");
		}
			
		String firstName = "Johnfisher";
		String lastName =  "Uchem";
		String SSN     =   "768455687";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		//Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(" ");
		System.out.println(SSN.substring(5));
	}

}

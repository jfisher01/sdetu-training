package basics;

public class Weather {
	public static void main(String[] args) {
		
	// Program suggests cloth to wear as par weather
		
		int temp = 80;
	    
		if(temp > 80) {
		System.out.println("The weather is hot. Wear singlate ");
		}
		else if (temp == 80) {
			System.out.println("The weather is moderate. Wear T-shirt");
		}
		else System.out.println("The weather is nice.");
	}

}

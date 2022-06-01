package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array and define the size implicitly
		String [] cities = { "New York", "San Francisco", "Miami", "Dallas"};
		
		System.out.println( cities[0]);
		System.out.println( cities[1]);
		System.out.println( cities[2]);
		System.out.println( cities[3]);
		
			
		//Declare array
		String[] countries;
		
		// Define the array with size of 3
		countries = new String [3];
		countries [0] = "USA";
		countries [1] = "Canada";
		countries [2] = "UK";
		
		//System.out.println( countries[2]);
		System.out.println();
		System.out.println("***************************");
	//Declare an array and define the size explicitly
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "North Dakota";
		states[4] = "Texas";
		System.out.println();
		//System.out.println( states[0]);
		
		int i = 0;
		
		//Do Loop enters the loop then tests condition
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		System.out.println();
		
		int n = 0;
		//While Loop : tests condition first then enters loop
		while (n <= 4) {
			System.out.println("STATE at " + n + " : "	+ states[n]);
			n++;
		}
		
		System.out.println("*******************************");
		int m = 0;
		boolean stateFound = false;
		while (! stateFound) {
			String state = states[m];
			System.out.println(state);
			if(state == "Texas") {
			System.out.println("STATE FOUND!");
			stateFound = true;
			}
			m++;
		}
		
		System.out.println("************************");
		System.out.println("PRINTING WITH FOR LOOP");
		
		for(int x = 0 ; x < 5 ; x++) {
			System.out.println(states[x]);
		}
	}

}

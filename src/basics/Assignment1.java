package basics;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = { 2, 5, 7, 1, 8, 11, 9};
		
		int sum = sum(array);
		
		System.out.println();
		System.out.println("Solution for question 1 :");
		System.out.println("The fatoctorial values is " + sum );
		System.out.println();
		
		System.out.println("**********************");
		
		int n = 4;
		
		int factorialValue = factorial( n);
		//System.out.println("Solution for question 2 : " + factorialValue);
        System.out.println(factorial(5));
		
		
		System.out.println();
		System.out.println("**********************");
		int max = findMax(array);
		int min =   findMin(array);
		int average = findAvg(array);
		
		System.out.println("Solution for question 3 ");
		System.out.println( "Maximum is : " + max + " , Minimum : " + min + " , Average is " + average );
		
		System.out.println("**********************");
		sumNum( 5);
		
		
	}
	
		//Write a function that takes a value n returns the sum of numbers 1 to n
		public static int sum(int[] numbers) {
		    int sum=0;
		    for (int i = 0; i < numbers.length; i++) {
		        sum=sum+numbers[i];
		    }
		    return sum;
		}
	
			
	


//Write a function that computes the factorial value
//Definition: n! = n*(n-1)! , where 0! = 1
//1! = 1
//2! = 2 * 1! = 2 * 1
//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
//Hint: use the recursive method that was used to calculate Fibonnaci number

public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
   
    return factorial(n-1) * n;
}


//Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
//Hint: this should be static functions with a return type of the same data type as the array declaration.

public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int findAvg(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum / arr.length;
}


//1. Write a function that takes a value n returns the sum of numbers 1 to n
public static int sumNum(int num) {
	
	
	int sum = 0;
	
	for (int i = 1; i <= num; i++) {
		
		System.out.print(i + " + "  + sum);
		sum = sum + i;
		System.out.println(" = "  +  sum);
		
		
	}
	return sum;
}

}




























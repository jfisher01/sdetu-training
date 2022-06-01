package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Fibonnaci number
	// fib(0) = 0
	// fib(1) = 1
	// fib(2) = fib(1) + fin(0) = 0 + 1 = 1
	// fib(3) = fib(2) + fin(1) = 1 + 1 = 2
	// fib(4) = fib(3) + fin(2) + fib(1) = 2 + 1 = 3
	// fib(5) = fib(4) + fin(3) = 3 + 2 = 5
	
	//System.out.println(fib(0));
	//System.out.println(fib(1));
	//System.out.println(fib(2));
	//System.out.println(fib(3));
	//System.out.println(fib(4));
	System.out.println(fib(5));
	
	// 1! = 1*1
	// 2! = 2*1
	// 3! = 3*2*1
	// 4! = 4*3*2*1
	
	}
       public static int fib(int n) {
    	   
    	   if (n == 0) {
    		   
    	   return 0;
    	   
       }
    	   
    	   else if (n == 1) {
    		   
    		   return 1;
    	   }
    	   return (fib (n - 1) + fib(n-2));
}
}

package Recursion;

public class Factorial {	
	
	public static long factorial (int n) {
		if(n==0||n==1)
			return 1;
		else if(n>1)
			return n*factorial(n-1);
		else return -1;
		
	}
	
	
	public static void main(String [] args) {

		System.out.println(factorial(10));
		
	}
}

package Recursion;

import java.util.Scanner;

public class Euclidean {

	private int gcd(int num1, int num2) {
		int result = num1%num2;
		if(num1%num2==0)
			return num2;
		else 
			return gcd(num2,result);
	}
	
	public static void main(String [] args) {
		Euclidean eg = new Euclidean();
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		System.out.printf("gcd(%d,%d) = %d",num1,num2,eg.gcd(num1,num2));
	}
}

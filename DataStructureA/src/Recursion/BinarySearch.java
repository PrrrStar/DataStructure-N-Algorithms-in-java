package Recursion;

import java.util.Scanner;

public class BinarySearch {
	public int [] a;
	
	public BinarySearch(int[] val) {
		a = val;
	}
	
	public int search(int left, int right, int key) {
		int result =0;
		if(left > right)
			result =-1;
		else {
			int m = (left+right)/2;
			System.out.println("Check : "+a[m]);
			if(key == a[m])
				result = m;
			else if( key < a[m])
				result=search(left,m-1,key);
			else {
				result = search(m+1,right,key);
			}
		}
		return result;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int [] v=  {60,110,155,214,255,274,293,369,396,427,436,462};
		
		
		
		BinarySearch bs = new BinarySearch(v);
		
		System.out.println(bs.search(0, v.length, x));
	
	}

}

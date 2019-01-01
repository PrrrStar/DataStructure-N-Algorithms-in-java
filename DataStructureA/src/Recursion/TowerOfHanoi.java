package Recursion;

public class TowerOfHanoi {

	public void move(int n, char source, char temp, char target) {
		if(n==1) 
			System.out.println(source+"->"+target);
		else {
			move(n-1,source,target,temp);
			System.out.println(source+"->"+target);
			move(n-1,temp,source,target);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi t = new TowerOfHanoi();
		t.move(2, 'A', 'B', 'C');
	}
}

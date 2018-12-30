package Stack;

public class StackTest {
	public static void main(String [] args) {
		Stack<String> st = new ListStack<String>();

		
		System.out.println(st.push("A"));
		System.out.println(st.push("B"));
		System.out.println(st.push("C"));
		System.out.println(st.push("D"));
		
		System.out.println("Stack size : "+st.size());
		System.out.println("top : "+st.peek());
		
		System.out.println(st.pop()+" is out");
		System.out.println(st.pop()+" is out");
		System.out.println(st.pop()+" is out");
		System.out.println(st.pop()+" is out");

		System.out.println("Stack size : "+st.size());
	}
}

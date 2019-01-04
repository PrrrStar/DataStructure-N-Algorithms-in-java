package Tree;

import java.util.Stack;

public class RPN {
	
	private boolean isAnOperator(String s) {
		return(s.length() ==1&&"ASMD".indexOf(s)>=0);
	}
	
	private double evaluate(double x, double y, String op) {
		double z =0;
		if(op.equals("A"))
			z = x+y;
		if(op.equals("S"))
			z = x-y;
		if(op.equals("M"))
			z = x*y;
		if(op.equals("D"))
			z = x/y;
		System.out.println(x+" "+op+" "+y+" = "+z);
		
		return z;
	}
	
	public RPN(String[] exp) {
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<exp.length; i++) {
			String input = exp[i];
			if(isAnOperator(input)) {
				double y = Double.parseDouble(stack.pop());
				double x = Double.parseDouble(stack.pop());
				double z = evaluate(x,y,input);
				stack.push(String.valueOf(z));
				
			}else
				stack.push(input);
		}
	}
	
}

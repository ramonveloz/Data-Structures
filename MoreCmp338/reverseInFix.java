package MoreCmp338;

public class reverseInFix {

	public static void main(String[] args) {
		String postfix = "2+3*4";
	
		
		System.out.println(infix2postfix(postfix) + " = "  + "234*+");

	}
	
	public static String infix2postfix(String inFix) {
		stack stack = new stack(inFix.length() / 2 );
		String postfix = "";
		
		for(int i = 0; i < inFix.length(); i++) {
			
			char op = inFix.charAt(i);
			if (isOperator(op)) {
				stack.push(op);
				
				
			}
			else {
				postfix += op;
			}
		}
		
		while(!stack.isEmpty()) {
			
		}
		
		return postfix;
	}
	
	
	
	
	public static boolean isOperator(char c) {
	
		return (c == '*') || (c == '+') || (c == '/') || (c    == '-');
	}
}




package collection;
import java.util.*;

public class BalanceParenthesis {
	public static boolean balance(String str) {
		Stack <Character> st = new Stack<>();
		for(char ch:str.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']') {
				if(st.isEmpty()) {
					return false;
				}
				char top = st.pop();
				if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	            }
			}
		}
		return st.isEmpty();
		
		
		
	}
	
	  public static void main(String[] args) {
	        // Test strings
	        String expr1 = "{[()]}";
	        String expr2 = "{[(])}";
	        String expr3 = "([{}])";

	        System.out.println(expr1 + " is balanced: " + balance(expr1)); 
	        System.out.println(expr2 + " is balanced: " + balance(expr2)); 
	        System.out.println(expr3 + " is balanced: " + balance(expr3)); 
	  }
	
}

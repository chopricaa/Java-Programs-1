package collection;


import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String S = "()(()(())"; 
        System.out.println(findLongestValidParentheses(S));
    }

    public static int findLongestValidParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 
        int maxLength = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(') {
                stack.push(i); 
            } else {
                stack.pop(); 

                if (stack.isEmpty()) {
                    stack.push(i); 
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }	

        return maxLength;
    }
}



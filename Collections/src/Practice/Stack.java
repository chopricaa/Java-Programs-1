package Practice;

public class Stack {
	private int[] stack;
	private int top;
	
	public Stack(int size) {
		stack = new int[size];
		top=-1;
		
	}
	
	
	public void push(int value) {
		if(top==stack.length-1) {
			System.out.println("Stack Overflow");
		}
		else {
			stack[++top] = value;
			System.out.println(value + "pushed into stack");
		}
	}
	
	
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stacak Underflow");
			return -1;
		}
		return stack[top--];
		
	}
	
	public int peek() {
        return top == -1 ? -1 : stack[top];
    }

	  public boolean isEmpty() {
	        return top == -1;
	    }
	  
	  public static void main(String[] args) {
	        Stack stack = new Stack(3);
	        stack.push(5);
	        stack.push(10);
	        System.out.println("Top element: " + stack.peek());
	        System.out.println("Popped: " + stack.pop());
	        System.out.println("Stack empty? " + stack.isEmpty());
	    }
	  
	  
	  

}

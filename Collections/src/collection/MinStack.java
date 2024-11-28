package collection;

import java.util.Stack;
public class MinStack {
    int min = Integer.MAX_VALUE;

        Stack<Integer> stack = new Stack<>();


        public  void push(int x) {
            // When the new value is less than or equal to the current minimum,
            // push the old minimum value onto the stack first
            if (x <= min) {
                stack.push(min);
                min = x;  // Update the current minimum
            }
            stack.push(x);  // Push the new value
        }

        // Pop method
        public   void pop() {
            // If the top element is the current minimum, pop twice:
            // first to remove the current value, and second to restore the previous minimum
            if (stack.pop() == min) {
                min = stack.pop();
            }
        }
        

        // Top method to return the top element
        public  int top() {
            return stack.peek();
        }

        // GetMin method to return the current minimum element
        public   int getMin() {
            return min;
        }

        public static void main(String[] args) {
            MinStack minStack = new MinStack();

            // Test case 1
            minStack.push(30);
            minStack.push(29);
            minStack.push(18);
            minStack.push(15);
            minStack.push(16);
            System.out.println("Current min: " + minStack.getMin());
            System.out.println("Top element: " + minStack.top());

            // Test case 2
            minStack.pop();
            System.out.println("Top element after pop: " + minStack.top());
            System.out.println("Current min after pop: " + minStack.getMin());

            // Test case 3
            minStack.pop();
            System.out.println("Current min after second pop: " + minStack.getMin());

            
        }
    }





//import java.util.Stack;
//
//public class CustomStack {
//    private Stack<Integer> stack;
//    private Stack<Integer> minStack;
//
//    public CustomStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.isEmpty() || val <= minStack.peek()) {
//            minStack.push(val);
//        }
//    }
//
//    public void popUntilMinAndGreater() {
//        if (stack.isEmpty() || minStack.isEmpty()) {
//            System.out.println("Stack is empty.");
//            return;
//        }
//        
//        int min = minStack.peek(); // Get the current minimum element
//        
//        // Pop elements until min or greater than min are removed
//        while (!stack.isEmpty() && (stack.peek() == min || stack.peek() > min)) {
//            int poppedValue = stack.pop();
//            System.out.println("Popped: " + poppedValue);
//            if (poppedValue == minStack.peek()) {
//                minStack.pop(); // Remove from minStack as well if it's the minimum
//            }
//        }
//        
//        // Print the remaining elements in the stack
//        System.out.println("Remaining elements in the stack: " + stack);
//    }
//
//    public void printStack() {
//        System.out.println("Stack: " + stack);
//    }
//
//    public static void main(String[] args) {
//        CustomStack customStack = new CustomStack();
//
//        // Push elements into the stack
//        customStack.push(30);
//        customStack.push(29);
//        customStack.push(18);
//        customStack.push(15);
//        customStack.push(16);
//
//        System.out.println("Initial stack:");
//        customStack.printStack();  // Print stack before popping
//
//        System.out.println("\nPopping elements greater than or equal to the minimum (15):");
//        customStack.popUntilMinAndGreater();  // Pop 16 and 15
//
//        System.out.println("\nFinal state of the stack:");
//        customStack.printStack();  // Print remaining elements
//    }
//}

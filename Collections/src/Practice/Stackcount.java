package Practice;
import java.util.Stack;

public class Stackcount {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        int count = stack.size();
        System.out.println("Stack Elements: " + stack);
        System.out.println("Total number of elements in the stack: " + count);
    }
}

package Collections;

import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack);

        System.out.println(stack.search(2));

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.search(4));

        System.out.println(stack.peek());
    }
}

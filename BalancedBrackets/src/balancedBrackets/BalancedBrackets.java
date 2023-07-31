package balancedBrackets;
import java.util.*;

public class BalancedBrackets {
    public boolean isBalanced(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                // If the character is an opening bracket, push it to the stack
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                // If the character is a closing bracket and matches the top of the stack, pop the stack
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                // If the character is neither an opening nor closing bracket, it's unbalanced
                return false;
            }
        }

        // If the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }
}

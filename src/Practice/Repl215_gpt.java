package Practice;

import java.util.Stack;

public class Repl215_gpt {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(') {
                stack.push(bracket);
            } else if (bracket == ')') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(()"));  // false
        System.out.println(isBalanced("("));  // false
        System.out.println(isBalanced(")"));  // false
        System.out.println(isBalanced("(()))"));  // false
        System.out.println(isBalanced("(())"));  // true
        System.out.println(isBalanced("()"));  // true
        System.out.println(isBalanced(")()("));  // false
    }

}

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(last, ch)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }

    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
                (last == '{' && cur == '}') ||
                (last == '[' && cur == ']');
    }
}
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);
            }

            // Closing bracket ')'
            else if (ch == ')') {

                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }

            // Closing bracket ']'
            else if (ch == ']') {

                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }

            // Closing bracket '}'
            else if (ch == '}') {

                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
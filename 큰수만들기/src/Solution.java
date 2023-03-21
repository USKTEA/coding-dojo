import java.util.Stack;

public class Solution {
    public String solution(String number, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int toDelete = k;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i += 1) {
            char current = number.charAt(i);

            while (!stack.isEmpty() && stack.peek() < current && toDelete-- > 0) {
                stack.pop();
            }

            stack.push(current);
        }

        for (int i = 0; i < number.length() - k; i += 1) {
            stringBuilder.append(stack.get(i));
        }

        return stringBuilder.toString();
    }
}

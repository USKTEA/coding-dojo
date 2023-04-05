import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        int[] biggerNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i += 1) {
            if (stack.isEmpty()) {
                stack.push(i);

                continue;
            }

            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int index = stack.pop();

                biggerNumbers[index] = numbers[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            biggerNumbers[stack.pop()] = -1;
        }

        return biggerNumbers;
    }
}

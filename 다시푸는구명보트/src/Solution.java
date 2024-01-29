import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;

        Deque<Integer> sorted = Arrays.stream(people)
                .sorted()
                .collect(ArrayDeque::new, Deque::add, Deque::addAll);

        while (!sorted.isEmpty()) {
            int weight = sorted.pollLast();

            if (!sorted.isEmpty() && sorted.peek() + weight <= limit) {
                sorted.poll();
            }

            count += 1;
        }

        return count;
    }
}

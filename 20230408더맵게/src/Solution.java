import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> scovilles = IntStream.of(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));

        int count = 0;
        int min = scovilles.peek();

        while (min < k && scovilles.size() > 1) {
            int first = scovilles.poll();
            int second = scovilles.poll();

            int combined = combine(first, second);

            scovilles.add(combined);
            min = scovilles.peek();
            count += 1;
        }

        return count;
    }

    public int combine(int first, int second) {
        return first + (second * 2);
    }
}

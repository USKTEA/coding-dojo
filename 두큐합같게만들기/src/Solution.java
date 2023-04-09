import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Double> q1 = toQueue(queue1);
        Queue<Double> q2 = toQueue(queue2);

        double sum1 = sum(queue1);
        double sum2 = sum(queue2);

        if (!isPair(sum1 + sum2)) {
            return -1;
        }

        int maxCount = (q1.size() + q2.size()) * 2;

        int count = 0;

        while (sum1 != sum2) {
            count++;

            Double poll;

            if (sum1 > sum2) {
                poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.offer(poll);

                continue;
            }

            poll = q2.poll();
            sum1 += poll;
            sum2 -= poll;
            q1.offer(poll);

            if (count > maxCount) {
                return -1;
            }
        }

        return count;
    }

    private Queue<Double> toQueue(int[] queue1) {
        Queue<Double> queue = new ArrayDeque<>();

        for (int i = 0; i < queue1.length; i += 1) {
            queue.add(Double.valueOf(queue1[i]));
        }

        return queue;
    }

    private boolean isPair(double sum) {
        return sum % 2 == 0 ? true : false;
    }

    private long sum(int[] queue) {
        long sum = 0;

        for (int i = 0; i < queue.length; i += 1) {
            sum += queue[i];
        }

        return sum;
    }
}

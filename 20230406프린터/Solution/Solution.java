import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            q.offer(priorities[i]);
        }

        while (q.size() > 0) {
            for (int i = 0; i < priorities.length; i += 1) {
                if (priorities[i] == q.peek()) {
                    if (i == location) {
                        answer += 1;

                        return answer;
                    }

                    q.poll();
                    answer += 1;
                }
            }
        }

        return answer;
    }
}

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;

        PriorityQueue<Integer> passed = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < enemy.length; i += 1) {
            n -= enemy[i];
            passed.add(enemy[i]);

            if (n < 0) {
                if (k > 0) {
                    n += passed.poll();
                    k -= 1;

                    continue;
                }

                answer = i;

                break;
            }
        }

        return answer;
    }
}

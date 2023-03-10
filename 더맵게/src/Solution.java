import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int k) {
        return combine(scoville, k);
    }

    public int combine(int[] scoville, int k) {
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();

        for (int number : scoville) {
            scovilleQueue.add(number);
        }

        int count = 0;
        int lowest = scovilleQueue.poll();

        while (!scovilleQueue.isEmpty() && lowest < k) {
            scovilleQueue.add(lowest + scovilleQueue.poll() * 2);

            count += 1;
            lowest = scovilleQueue.poll();
        }

        if (lowest < k) {
            return -1;
        }

        return count;
    }
}

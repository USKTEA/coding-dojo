import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int n, int m, int[] section) {
        Roller roller = new Roller(m);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < section.length; i += 1) {
            queue.add(section[i]);
        }

        int position = 0;

        while (!queue.isEmpty()) {
            position = queue.remove();

            while (position > roller.position()) {
                roller.paint(position);
            }
        }

        return roller.painted();
    }
}

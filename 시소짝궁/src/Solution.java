import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static int[] METERS = new int[]{2, 3, 4};

    public int solution(int[] weights) {
        int counts = 0;

        Queue<Integer> players = toPlayers(weights);

        Seesaw seesaw = new Seesaw(METERS);

        while (players.size() > 1) {
            int left = players.poll();

            for (int right : players) {
                if (seesaw.isBalanced(left, right)) {
                    counts += 1;
                }
            }
        }

        return counts;
    }

    public Queue<Integer> toPlayers(int[] weights) {
        Queue<Integer> players = new LinkedList<>();

        for (int i = 0; i < weights.length; i += 1) {
            players.add(weights[i]);
        }

        return players;
    }
}

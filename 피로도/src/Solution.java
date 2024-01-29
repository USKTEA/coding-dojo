public class Solution {
    private int visited = 0;
    private boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        getMaximumVisited(0, k, dungeons);

        return visited;
    }

    private void getMaximumVisited(int visitedCount, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i += 1) {
            if (!visit[i] && k >= dungeons[i][0]) {
                visit[i] = true;

                getMaximumVisited(visitedCount + 1, k - dungeons[i][1], dungeons);

                visit[i] = false;
            }
        }

        visited = Math.max(visited, visitedCount);
    }
}

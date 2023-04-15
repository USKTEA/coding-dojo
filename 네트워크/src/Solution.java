public class Solution {

    public int solution(int n, int[][] computers) {
        int network = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < computers.length; i += 1) {
            if(!visited[i]) {
                network += 1;
                visit(computers, i, visited);
            }
        }

        return network;
    }

    private void visit(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j += 1) {
            if (j != i && computers[i][j] == 1 && !visited[j]) {
                visit(computers, j, visited);
            }
        }
    }
}

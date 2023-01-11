public class Solution {

    public int solution(int n, int a, int b) {
        return startTournament(1, a, b);
    }

    public int startTournament(int round, int a, int b) {
        if (willMatch(a, b)) {
            return round;
        }

        int nextA = a % 2 + a / 2;
        int nextB = b % 2 + b / 2;

        return startTournament(round + 1, nextA, nextB);
    }

    public boolean willMatch(int a, int b) {
        if ((a / 2 + a % 2) == (b / 2 + b % 2)) {
            return true;
        }

        return false;
    }
}

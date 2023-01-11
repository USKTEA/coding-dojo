import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();

        int round = solution.solution(8, 4, 7);

        assertEquals(3, round);
    }

    @Test
    void startTournament() {
        Solution solution = new Solution();

        int round = solution.startTournament(1, 4, 7);

        assertEquals(3, round);
    }

    @Test
    void willMatch() {
        Solution solution = new Solution();

        boolean answer1 = solution.willMatch(4, 7);

        assertEquals(false, answer1);

        boolean answer2 = solution.willMatch(1, 2);

        assertEquals(true, answer2);

        boolean answer3 = solution.willMatch(3, 4);

        assertEquals(true, answer3);
    }
}

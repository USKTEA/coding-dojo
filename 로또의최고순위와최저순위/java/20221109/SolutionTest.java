import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getMinimumScore() {
        Solution solution = new Solution();
        int minimumScore = solution.getMinimumScore(
                new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19});

        assertEquals(2, minimumScore);
    }

    @Test
    void countMagicNumber() {
        Solution solution = new Solution();

        int count = solution.countMagicNumber(new int[]{44, 1, 0, 0, 31, 25});

        assertEquals(2, count);
    }

    @Test
    void getMaximum() {
        Solution solution = new Solution();

        int maximum = solution.getMaximum(2, 2);

        assertEquals(4, maximum);
    }

    @Test
    void getHighestAndLowestScore() {
        Solution solution = new Solution();

        int[] highestAndLowest = solution.getHighestAndLowest(2, 2);

        assertArrayEquals(new int[]{4, 2}, highestAndLowest);
    }

    @Test
    void getRanking() {
        Solution solution = new Solution();

        int ranking = solution.getRanking(6);

        assertEquals(1, ranking);
    }

    @Test
    void getRankings() {
        Solution solution = new Solution();

        int[] rankings = solution.getRankings(new int[] {4, 2});

        assertArrayEquals(new int[] {3, 5}, rankings);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int[] answer = solution.solution(
                new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19});

        assertArrayEquals(new int[]{3, 5}, answer);
    }
}

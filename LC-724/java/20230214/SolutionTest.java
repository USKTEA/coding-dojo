import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getPivot1() {
        Solution solution = new Solution();
        int answer = solution.getPivot(new int[]{2, 1, 2}, 0);

        assertEquals(1, answer);
    }

    @Test
    void getPivot2() {
        Solution solution = new Solution();
        int answer = solution.getPivot(new int[]{1, 7, 3, 6, 5, 6}, 0);

        assertEquals(3, answer);
    }

    @Test
    void getPivot3() {
        Solution solution = new Solution();
        int answer = solution.getPivot(new int[]{-1, -1, 0, 1, 1, 0}, 0);

        assertEquals(5, answer);
    }
}

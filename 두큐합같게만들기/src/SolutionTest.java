import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});

        assertEquals(2, result);
    }

    @Test
    void whenSumIsNotPair() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1}, new int[]{1, 2});

        assertEquals(-1, result);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1});

        assertEquals(5, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(2, 4, new int[]{3, 3, 3, 3});

        assertEquals(4, result);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(10, 40, 5);

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(10, 40, 30);

        assertEquals(1, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(2, 5, 4);

        assertEquals(-1, result);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{70, 50, 80, 50}, 100);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{70, 80, 50}, 100);

        assertEquals(3, result);
    }
}

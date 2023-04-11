import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(2, 10, new int[] {7, 4, 5, 6});

        assertEquals(8, answer);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int answer = solution.solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10});

        assertEquals(110, answer);
    }
}

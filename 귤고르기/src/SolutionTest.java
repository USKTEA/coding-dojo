import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        int result = solution.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3});

        assertEquals(3, result);
    }
}

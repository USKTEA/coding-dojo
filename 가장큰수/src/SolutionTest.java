import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        String answer = solution.solution(new int[]{6, 10, 2});

        assertEquals("6210", answer);
    }
}

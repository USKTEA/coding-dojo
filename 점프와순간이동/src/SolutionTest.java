import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        int answer = solution.solution(5000);

        assertEquals(5, answer);
    }
}

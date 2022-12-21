import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void matcher() {
        Solution solution = new Solution();
        boolean result = solution.match(1, 15);

        assertEquals(result, true);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(15);

        assertEquals(4, answer);
    }
}

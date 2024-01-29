import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        long result = solution.solution(4);

        assertEquals(5, result);
    }
}

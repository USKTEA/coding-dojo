import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(4, 1, new int[]{1, 2, 3, 4});

        assertEquals(4, answer);
    }
}

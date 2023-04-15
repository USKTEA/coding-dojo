import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        assertEquals(2, answer);
    }
}

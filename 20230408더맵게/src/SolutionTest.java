import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);

        assertEquals(2, answer);
    }

    @Test
    void combine() {
        Solution solution = new Solution();
        int combined = solution.combine(1, 2);

        assertEquals(5, combined);
    }
}

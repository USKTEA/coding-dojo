import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void combineElements() {
        Solution solution = new Solution();

        int counts = solution.combine(new int[]{1, 2, 3, 9, 10, 12}, 7);

        assertEquals(2, counts);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int answer = solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);

        assertEquals(2, answer);
    }
}

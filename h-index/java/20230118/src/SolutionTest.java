import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int answer1 = solution.solution(new int[]{3, 0, 6, 1, 5});

        assertEquals(3, answer1);

        int answer2 = solution.solution(new int[]{6, 5, 5, 5, 3, 2, 1, 0});

        assertEquals(4, answer2);
    }
}

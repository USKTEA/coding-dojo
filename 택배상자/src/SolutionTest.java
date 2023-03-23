import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{4, 3, 1, 2, 5});

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 4, 3, 5});

        assertEquals(5, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9});

        assertEquals(10, result);
    }

    @Test
    void solution4() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{2, 1, 6, 7, 5, 8, 4, 9, 3, 10});

        assertEquals(10, result);
    }
}

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 1, 4});

        assertEquals(0, result);
    }

    @Test
    void rightPart() {
        Solution solution = new Solution();
        Map<Integer, Integer> counts = solution.rightPart(new int[]{1, 2, 1, 3, 1, 4, 1, 2});

        assertEquals(Map.of(
                1, 4,
                2, 2,
                3, 1,
                4, 1
        ), counts);
    }
}

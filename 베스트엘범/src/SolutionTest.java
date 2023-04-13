import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int[] answer = solution.solution(
                new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});

        assertArrayEquals(new int[]{4, 1, 3, 0}, answer);
    }
}

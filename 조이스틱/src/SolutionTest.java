import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int result = solution.solution("ABB");

        assertEquals(2, result);
    }

    @Test
    void initialChars() {
        Solution solution = new Solution();
        int[] initialChars = solution.initialChars(6);

        assertArrayEquals(new int[]{65, 65, 65, 65, 65, 65}, initialChars);
    }

    @Test
    void toChars() {
        Solution solution = new Solution();
        int[] chars = solution.toChars("AAB");

        assertArrayEquals(new int[]{65, 65, 66}, chars);
    }

    @Test
    void minMoves() {
        Solution solution = new Solution();
        int index = 0;

        int moves = solution.minMoves(new int[] {65}, new int[]{89}, index);

        assertEquals(2, moves);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] result = solution.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});

        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] result = solution.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});

        assertArrayEquals(new int[]{333, -45}, result);
    }

    @Test
    void toNumber() {
        Solution solution = new Solution();
        int number = solution.toNumber("-16");

        assertEquals(-16, number);
    }
}

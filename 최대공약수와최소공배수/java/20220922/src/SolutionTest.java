import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void gcf() {
        Solution solution = new Solution();

        assertEquals(3, solution.gcf(3, 12));
        assertEquals(1, solution.gcf(2, 5));
    }

    @Test
    void compare() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1, 2}, solution.compare(1, 2));
    }

    @Test
    void gcm() {
        Solution solution = new Solution();

        assertEquals(12, solution.gcm(3, 12));
        assertEquals(10, solution.gcm(2, 5));
    }
}

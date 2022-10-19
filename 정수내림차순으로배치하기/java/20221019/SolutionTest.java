import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sort() {
        Solution solution = new Solution();
        String array = solution.sort(118372);

        assertEquals("873211", array);
    }

    @Test
    void toLong() {
        Solution solution = new Solution();
        long reversed = solution.toLong("873211");

        assertEquals(873211, reversed);
    }
}

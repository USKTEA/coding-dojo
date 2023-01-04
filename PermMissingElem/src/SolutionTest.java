import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sort() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1, 2, 3, 4, 5,}, solution.sort(new int[] {2, 5, 1, 2, 3}));

    }
}

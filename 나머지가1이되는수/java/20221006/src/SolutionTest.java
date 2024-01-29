import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dividerStream() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {3, 9}, solution.dividerStream(10).toArray());
    }

    @Test
    void minimum() {
        Solution solution = new Solution();

        assertEquals(3, solution.minimum(Arrays.stream(new int[] {3, 9})));
    }
}

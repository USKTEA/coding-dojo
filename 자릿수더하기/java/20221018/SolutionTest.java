import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toArray() {
        Solution solution = new Solution();
        String[] array = solution.toArray(123);

        assertArrayEquals(new String[] {"1", "2", "3"}, array);
    }

    @Test
    void sum() {
        Solution solution = new Solution();
        int sum = solution.sum(new String[] {"1", "2", "3"});

        assertEquals(6, sum);
    }
}

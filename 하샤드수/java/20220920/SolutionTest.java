import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sum() {
        Solution solution = new Solution();
        assertEquals(1, solution.sum(10));
    }

    @Test
    void divide() {
        Solution solution = new Solution();
        assertEquals(true, solution.divide(10, 1));
        assertEquals(false, solution.divide(11, 2));
    }
}

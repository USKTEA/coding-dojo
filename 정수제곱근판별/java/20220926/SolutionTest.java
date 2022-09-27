import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sqrt() {
        Solution solution = new Solution();

        assertEquals(11, solution.sqrt(121));
        assertEquals(-1, solution.sqrt(3));
    }

    @Test
    void answer() {
        Solution solution = new Solution();

        assertEquals(-1, solution.answer(-1));
        assertEquals(144, solution.answer(11));
    }
}

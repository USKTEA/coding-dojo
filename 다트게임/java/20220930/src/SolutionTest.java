import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void split() {
        Solution solution = new Solution();
        assertArrayEquals(new String[] {"1S", "2D*", "3T"}, solution.split("1S2D*3T"));
    }

    @Test
    void results() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {2, 8, 27}, solution.result(new String[] {"1S", "2D*", "3T"}));
        assertArrayEquals(new int[] {2}, solution.result(new String[] {"1S*"}));
        assertArrayEquals(new int[] {27}, solution.result(new String[] {"3T"}));
        assertArrayEquals(new int[] {4, 16, 3}, solution.result(new String[] {"1S*", "2T*", "3S"}));
    }

    @Test
    void sum() {
        Solution solution = new Solution();

        assertEquals(9, solution.solution("1D2S#10S"));
        assertEquals(110, solution.solution("10D10S0D"));
    }
}

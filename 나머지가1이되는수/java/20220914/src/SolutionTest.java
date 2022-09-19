import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void isPrime() {
        Solution solution = new Solution();

        assertEquals(true, solution.isPrime(5));
        assertEquals(false, solution.isPrime(6));
    }

    @Test
    void result() {
        Solution solution = new Solution();

        assertEquals(16, solution.solution(17));
        assertEquals(28, solution.solution(29));
        assertEquals(3, solution.solution(10));
    }
}

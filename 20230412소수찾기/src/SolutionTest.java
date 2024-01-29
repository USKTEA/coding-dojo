import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int answer = solution.solution("17");

        assertEquals(3, answer);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int answer = solution.solution("011");

        assertEquals(2, answer);
    }

    @Test
    void isPrime() {
        Solution solution = new Solution();

        assertTrue(solution.isPrime(11));
        assertTrue(solution.isPrime(71));
        assertFalse(solution.isPrime(121));
        assertFalse(solution.isPrime(6));
    }
}

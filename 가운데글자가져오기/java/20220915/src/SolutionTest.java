import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void one() {
        Solution solution = new Solution();
        String answer = solution.solution("a");

        assertEquals("a", answer);
    }

    @Test
    void two() {
        Solution solution = new Solution();
        String answer = solution.solution("ab");

        assertEquals("ab", answer);
    }

    @Test
    void three() {
        Solution solution = new Solution();
        String answer = solution.solution("abc");

        assertEquals("b", answer);
    }

    @Test
    void four() {
        Solution solution = new Solution();
        String answer = solution.solution("abcd");

        assertEquals("bc", answer);
    }
}

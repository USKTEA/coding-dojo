import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toArray() {
        Solution solution = new Solution();
        String[] array = solution.toArray("baabaa");

        assertArrayEquals(new String[]{"b", "a", "a", "b", "a", "a"}, array);
    }

    @Test
    void removePairs() {
        Solution solution = new Solution();
        int result = solution.removePairs(new String[]{"b", "a", "a", "b", "a", "a"});

        assertEquals(0, result);
    }

    @Test
    void checkResult() {
        Solution solution = new Solution();

        int result = solution.checkResult(1);

        assertEquals(0, result);

        int result1 = solution.checkResult(0);

        assertEquals(1, result1);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int answer = solution.solution("baabaa");

        assertEquals(1, answer);
    }
}

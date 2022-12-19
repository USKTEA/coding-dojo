import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void indices() {
        Solution solution = new Solution();

        List<List<Integer>> indices = solution.parenthesisIndices("()()");

        List<Integer> opens = indices.get(0);
        List<Integer> closes = indices.get(1);

        assertEquals(List.of(0, 2), opens);
        assertEquals(List.of(1, 3), closes);
    }

    @Test
    void isValidParenthesis() {
        Solution solution = new Solution();

        boolean result1 = solution.isValidParenthesis("()()");

        assertEquals(true, result1);

        boolean result2 = solution.isValidParenthesis(")()(");

        assertEquals(false, result2);
    }
}

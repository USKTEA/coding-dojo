import org.junit.jupiter.api.Test;

import javax.print.attribute.ResolutionSyntax;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void split() {
        Solution solution = new Solution();
        assertArrayEquals(new String[] {"abc", "ABC"}, solution.split("abcABC"));
    }

    @Test
    void sortReverseOrder() {
        Solution solution = new Solution();

        assertEquals("cba", solution.reverseSort("abc"));
    }

    @Test
    void join() {
        Solution solution = new Solution();

        assertEquals("abcABC", solution.join(new String[] {"abc", "ABC"}));
    }

    @Test
    void answer() {
        Solution solution = new Solution();

        assertEquals("gfedcbZ", solution.solution("Zbcdefg"));
    }
}

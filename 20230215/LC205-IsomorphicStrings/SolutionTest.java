import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void split() {
        Solution solution = new Solution();
        String[] letters = solution.split("egg");

        assertArrayEquals(new String[]{"e", "g", "g"}, letters);
    }

    @Test
    void match() {
        Solution solution = new Solution();
        boolean result = solution.match(new String[]{"e", "g", "g"}, new String[]{"a", "d", "d"});

        assertTrue(result);
    }

    @Test
    void match2() {
        Solution solution = new Solution();
        boolean result = solution.match(new String[]{"p", "a", "p", "e", "r"}, new String[]{"t", "i", "t", "l", "e"});

        assertTrue(result);
    }

    @Test
    void match3() {
        Solution solution = new Solution();
        boolean result = solution.match(new String[]{"f", "o", "o"}, new String[]{"b", "a", "r"});

        assertFalse(result);
    }

    @Test
    void isIsomorphic() {
        Solution solution = new Solution();
        boolean result = solution.isIsomorphic("egg", "add");

        assertTrue(result);
    }

    @Test
    void isIsomorphic2() {
        Solution solution = new Solution();
        boolean result = solution.isIsomorphic("badc", "baba");

        assertFalse(result);
    }
}

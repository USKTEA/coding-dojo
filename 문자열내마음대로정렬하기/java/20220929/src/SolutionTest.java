import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void compare() {
        Solution solution = new Solution();
        assertArrayEquals(
                new String[] {"car", "bead", "bebd", "sun"},
                solution.primarySort(new String[] {"sun", "bebd", "bead", "car"}, 1)
        );
        assertArrayEquals(
                new String[] {"abcd", "abce", "cdx"},
                solution.primarySort(new String[] {"abcd", "abce", "cdx"}, 1)
        );
    }
}

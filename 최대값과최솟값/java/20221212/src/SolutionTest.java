import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void toIntegers() {
        Solution solution = new Solution();

        int[] integers = solution.toIntegers("1 2 3 4");

        assertArrayEquals(integers, new int[]{1, 2, 3, 4});
    }

    @Test
    void sort() {
        Solution solution = new Solution();

        int[] sorted = solution.sort(new int[]{1, 2, 3, 4});

        assertArrayEquals(sorted, new int[]{1, 2, 3, 4});
    }

    @Test
    void pickLowestAndHighest() {
        Solution solution = new Solution();

        String[] strings = solution.pickLowestAndHighest(new int[]{1, 2, 3, 4});

        assertArrayEquals(strings, new String[]{"1", " ", "4"});
    }

    @Test
    void toWord() {
        Solution solution = new Solution();
        String string = solution.toWord(new String[] {"1", " ", "4"});

        assertEquals(string, "1 4");
    }

    @Test
    void answer() {
        Solution solution = new Solution();
        String answer1 = solution.solution("1 2 3 4");

        assertEquals(answer1, "1 4");

        String answer2 = solution.solution("-1 -2 -3 -4");

        assertEquals(answer2, "-4 -1");

        String answer3 = solution.solution("-1 -1");

        assertEquals(answer3, "-1 -1");
    }
}

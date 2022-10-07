import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void creation() {
        Solution solution = new Solution();

        int[][] array = solution.createArray(5);

        assertAll(
                () -> assertEquals(5, array.length),
                () -> assertEquals(5, array[0].length),
                () -> assertEquals(5, array[4].length)
        );
    }

    @Test
    void fill() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0,1,0,0,1}, solution.toBinary(9, 5));
    }

    @Test
    void sum() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {1, 1, 1}, solution.sum(new int[]{1, 0, 1}, new int[]{0, 1, 0}));
    }

    @Test
    void decode() {
        Solution solution = new Solution();

        assertEquals("###", solution.decode(new int[] {1, 1, 1}));
        assertEquals("# #", solution.decode(new int[] {1, 0, 1}));
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        assertArrayEquals(new String[] {"#####", "# # #", "### #", "#  ##", "#####"},
                solution.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28}));
    }
}

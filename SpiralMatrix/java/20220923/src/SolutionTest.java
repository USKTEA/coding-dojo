import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void creation() {
        Solution solution = new Solution();
        int[][] array = solution.makeMatrix(3);

        assertArrayEquals(new int[3][3], array);
    }

    @Test
    void fill() {
        Solution solution = new Solution();
        int[][] array = solution.makeMatrix(4);

        assertArrayEquals(new int[][] {
                {0, 1, 2, 3},
                {11, 12, 13, 4},
                {10, 15, 14, 5},
                {9, 8, 7, 6}
        }, solution.fillMatrix(array, 4, 0, 0));
    }
}

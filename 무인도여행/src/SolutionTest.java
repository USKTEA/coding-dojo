import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void toTwoDimensionIntArray() {
        Solution solution = new Solution();
        int[][] intMaps = solution.toIntMaps(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});

        assertArrayEquals(new int[][]{{0, 5, 9, 1, 0}, {0, 1, 0, 5, 0}, {0, 2, 3, 1, 0}, {1, 0, 0, 0, 1}}, intMaps);
    }

    @Test
    void getSums() {
        Solution solution = new Solution();
        int[] sums = solution.getSums(new int[][]{{0, 5, 9}, {0, 1, 0}, {0, 2, 3}});

        assertArrayEquals(new int[]{20}, sums);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int[] answer = solution.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});

        assertArrayEquals(new int[]{1, 1, 27}, answer);
    }
}

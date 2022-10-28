import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void filter() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {5, 10}, solution.filter(new int[]{5, 9, 7, 10}, 5).toArray());
        assertArrayEquals(new int[] {}, solution.filter(new int[]{3, 2, 6}, 10).toArray());
    }

    @Test
    void sort() {
        Solution solution = new Solution();
        IntStream intStream1 = solution.filter(new int[]{5, 9, 7, 10}, 5);
        IntStream intStream2 = solution.filter(new int[]{10, 9, 7, 5}, 5);
        IntStream intStream3 = solution.filter(new int[]{2, 36, 1, 3}, 1);

        assertArrayEquals(new int[] {5, 10}, solution.sort(intStream1).toArray());
        assertArrayEquals(new int[] {5, 10}, solution.sort(intStream2).toArray());
        assertArrayEquals(new int[] {1, 2, 3, 36}, solution.sort(intStream3).toArray());
    }

    @Test
    void answer() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{5, 10}, solution.solution(new int[]{5, 9, 7, 10}, 5));
    }
}

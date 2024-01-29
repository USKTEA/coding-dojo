import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sortAsc() {
        Solution solution = new Solution();
        List<Integer> sorted = solution.sortAsc(new int[]{1, 4, 2});

        assertEquals(List.of(1, 2, 4), sorted);
    }

    @Test
    void sortDsc() {
        Solution solution = new Solution();
        List<Integer> sorted = solution.sortDsc(new int[]{1, 4, 2});

        assertEquals(List.of(4, 2, 1), sorted);
    }

    @Test
    void multiplyByIndex() {
        Solution solution = new Solution();

        int result = solution.multiplyByIndex(List.of(1), List.of(2), 0);

        assertEquals(2, result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int smallest = solution.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});

        assertEquals(29, smallest);
    }
}

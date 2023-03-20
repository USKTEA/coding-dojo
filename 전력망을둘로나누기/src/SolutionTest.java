import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});

        assertEquals(1, result);
    }

    @Test
    void solution4() {
        Solution solution = new Solution();
        int result = solution.solution(6, new int[][]{{1, 4}, {6, 3}, {2, 5}, {5, 1}, {5, 3}});

        assertEquals(2, result);
    }

    @Test
    void toTree() {
        Solution solution = new Solution();
        CustomTree customTree = solution.toTree(new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});

        assertEquals(CustomTree.of(new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}), customTree);
    }
}

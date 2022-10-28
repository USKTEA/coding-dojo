import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

// int  budget으로 최대한 많은 int[]d 요소를 삭제하게
// int[]d를 순회해서 map(int, List<Integer>) 자료구조를 만들고
// int[]를 정렬해서
// int[]를 바이너리 트리로 만들고
// int[]트리를 순회하면서 예산 감소

class SolutionTest {

    @Test
    void sort() {
        Solution solution = new Solution();
        int[] sortedArray = solution.sort(new int[]{1, 3, 2, 5, 4});

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    void addBudget() {
        Solution solution = new Solution();
        int[] sum = solution.sum(new int[]{1, 2, 3, 4, 5});

        assertArrayEquals(new int[]{1, 3, 6, 10, 15}, sum);
    }

    @Test
    void budgetExecution() {
        Solution solution = new Solution();
        int budget = 9;
        int[] requirement = new int[]{1, 3, 6, 10, 15};
        int count = solution.execution(budget, requirement);

        assertEquals(3, count);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(new int[]{1, 3, 6, 10, 15}, 9));
    }
}

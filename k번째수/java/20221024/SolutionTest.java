import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void toFirstCollection() {
        Solution solution = new Solution();
        Numbers numbers = solution.toFirstCollection(new int[]{1, 5, 2, 6, 3, 7, 4});

        assertEquals(new Numbers(new int[]{1, 5, 2, 6, 3, 7, 4}), numbers.getNumbers());
    }

    @Test
    void toCommand() {
        Solution solution = new Solution();
        Command command = solution.toCommandObject(new int[]{2, 5, 3});

        assertEquals(new Command(2, 5, 3), command);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        assertArrayEquals(new int[]{5, 6, 3}, result);
    }
}

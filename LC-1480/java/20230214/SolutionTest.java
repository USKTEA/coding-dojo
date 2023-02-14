import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void getAnswer() {
        Solution solution = new Solution();
        int[] answer = solution.getAnswer(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{1, 3, 6, 10}, answer);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void binaryCalculator() {
        Solution solution = new Solution();
        int[] answer1 = solution.calculate("01110");

        assertArrayEquals(new int[]{3,3}, answer1);

        int[] answer2 = solution.calculate("110010101001");

        assertArrayEquals(new int[]{3,8}, answer2);

        int[] answer3 = solution.calculate("1");

        assertArrayEquals(new int[]{0,0}, answer3);
    }
}

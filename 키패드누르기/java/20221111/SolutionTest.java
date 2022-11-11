import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void createHuman() {
        Solution solution = new Solution();
        Human rightHanded = solution.createHuman("right");
        Human leftHanded = solution.createHuman("left");

        assertEquals("right", rightHanded.priorHand());
        assertEquals("left", leftHanded.priorHand());
    }

    @Test
    void solution1() {
        Solution solution = new Solution();

        String answer = solution.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");

        assertEquals("LRLLLRLLRRL", answer);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();

        String answer = solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

        assertEquals("LLRLLRLLRL", answer);
    }

    @Test
    void changeZeroToEleven() {
        Solution solution = new Solution();
        int[] changed = solution.zeroToEleven(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11}, changed);
    }
}

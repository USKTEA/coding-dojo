import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void zip() {
        Solution solution = new Solution();
        int[] stream = solution.zip("KAKAO");

        assertArrayEquals(new int[]{11, 1, 27, 15}, stream);
    }
}

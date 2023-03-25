import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void hammingWeight() {
        Solution solution = new Solution();
        int result = solution.hammingWeight(00000000000000000000000000001011);

        assertEquals(3, result);
    }
}

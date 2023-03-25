import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void subtractProductAndSum() {
        Solution solution = new Solution();
        int result = solution.subtractProductAndSum(234);

        assertEquals(15, result);
    }

    @Test
    void sum() {
        Solution solution = new Solution();
        int result = solution.sum("234");

        assertEquals(9, result);
    }

    @Test
    void product() {
        Solution solution = new Solution();
        int result = solution.product("234");

        assertEquals(24, result);;
    }
}

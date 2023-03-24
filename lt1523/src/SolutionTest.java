import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int count = solution.countOdds(3, 7);

        assertEquals(3, count);
    }
}

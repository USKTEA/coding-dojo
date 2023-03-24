import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void average() {
        Solution solution = new Solution();
        double average = solution.average(new int[] {4000, 3000, 1000, 2000});

        assertEquals(2500, average);
    }
}

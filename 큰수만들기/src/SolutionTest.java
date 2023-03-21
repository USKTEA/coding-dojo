import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        String result = solution.solution("1924", 2);

        assertEquals("94", result);
    }
}

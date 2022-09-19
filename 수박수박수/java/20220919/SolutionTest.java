import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void su() {
        Solution solution = new Solution();

        assertEquals("수", solution.solution(1));
        assertEquals("수박", solution.solution(2));
        assertEquals("수박수", solution.solution(3));
    }
}

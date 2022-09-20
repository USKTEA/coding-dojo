import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isEven() {
        Solution solution = new Solution();

        assertEquals(true, solution.isEven(2));
    }

    @Test
    void ifEven() {
        Solution solution = new Solution();

        assertEquals(1, solution.solution(1));
        assertEquals(1, solution.solution(2));
        assertEquals(2, solution.solution(4));
    }
}

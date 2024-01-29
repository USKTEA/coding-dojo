import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countOne() {
        Solution solution = new Solution();
        int result = solution.countOne(78);

        assertEquals(4, result);
    }

    @Test
    void findNextBiggerNumber() {
        Solution solution = new Solution();
        int result = solution.findNextBigger(78, 4);

        assertEquals(83, result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(78);

        assertEquals(83, answer);
    }
}

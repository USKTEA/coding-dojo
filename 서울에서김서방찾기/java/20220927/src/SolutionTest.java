import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findIndex() {
        Solution solution = new Solution(new String[] {"김서방"});
        assertEquals(0, solution.findIndex("김서방"));
    }

    @Test
    void answer() {
        Solution solution = new Solution(new String[] {"Jane", "Kim"});

        assertEquals("김서방은 1에 있다", solution.string(1));
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        assertEquals("김서방은 1에 있다", solution.solution(new String[] {"Jane", "Kim"}));
    }
}

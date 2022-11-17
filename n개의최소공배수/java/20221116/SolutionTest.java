import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(new int[] {2,6,8,14});

        assertEquals(168, answer);

        int answer2 = solution.solution(new int[]{1,2,3});

        assertEquals(6, answer2);
    }
}

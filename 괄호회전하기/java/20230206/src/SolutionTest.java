import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void rotate() {
        Solution solution = new Solution();
        String[] rotated = solution.rotate(new String[]{"}", "]", "(", ")", "[", "{"});

        assertArrayEquals(new String[]{"]", "(", ")", "[", "{", "}"}, rotated);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution("[](){}");

        assertEquals(3, answer);

        int answer2 = solution.solution("}]()[{");
        assertEquals(2, answer2);
    }
}

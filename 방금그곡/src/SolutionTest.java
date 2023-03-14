import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        String answer = solution.solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"});

        assertEquals("WORLD", answer);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        String answer = solution.solution("ABC", new String[]{"17:00,17:40,HELLO,ABCDEF", "16:00,16:40,WORLD,ABCDEF"});

        assertEquals("WORLD", answer);
    }
}

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void whenSequenceIsPerfect() {
        Solution solution = new Solution();
        String answer = solution.solution("Jackdaws love my big sphinx of quartz");

        assertEquals("perfect", answer);
    }

    @Test
    void whenSequenceIsNotPerfect() {
        Solution solution = new Solution();
        String answer = solution.solution("abcedfghijklmnopqr stuvwxy");

        assertEquals("z", answer);
    }

    @Test
    void choiceAlphabet() {
        Solution solution = new Solution();
        Set<String> removed = solution.choiceAlphabet("aAbBCc");

        assertEquals(Set.of("a", "b", "c"), removed);
    }

    @Test
    void lostAlphabets() {
        Solution solution = new Solution();
        String losts = solution.lostAlphabets(Set.of("a", "b", "c"));

        assertEquals("defghijklmnopqrstuvwxyz", losts);
    }
}

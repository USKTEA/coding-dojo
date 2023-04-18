import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void solution() {
        int answer = solution.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});

        assertEquals(2, answer);
    }

    @Test
    void possibleToLearn() {
        assertTrue(solution.possible("CD", "CD"));
    }

    @Test
    void impossibleToLearn() {
        assertFalse(solution.possible("CD", "DC"));
    }

    @Test
    void learnedNothing() {
        String learned = solution.learned("ABC", 'A');

        assertEquals("", learned);
    }

    @Test
    void shouldLearnedOneSkill() {
        String learned = solution.learned("ABC", 'B');

        assertEquals("A", learned);
    }

    @Test
    void shouldLearnedTwoSkills() {
        String learned = solution.learned("ABC", 'C');

        assertEquals("AB", learned);
    }

    @Test
    void haveToLearnNothing() {
        String haveToLearn = solution.haveToLearned("BC", 'A');

        assertEquals("", haveToLearn);
    }

    @Test
    void haveToLearnOneSkill() {
        String haveToLearn = solution.haveToLearned("ABC", 'B');

        assertEquals("A", haveToLearn);
    }

    @Test
    void haveToLearnTwoSkills() {
        String haveToLearn = solution.haveToLearned("ABC", 'C');

        assertEquals("AB", haveToLearn);
    }
}

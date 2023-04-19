import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void whenWordIsAAAAE() {
        int result = solution.solution("AAAAE");

        assertEquals(6, result);
    }

    @Test
    void whenWordIsAAAE() {
        int result = solution.solution("AAAE");

        assertEquals(10, result);
    }

    @Test
    void whenWordIsI() {
        int result = solution.solution("I");

        assertEquals(1563, result);
    }

    @Test
    void whenCurrentWordIsEmpty() {
        String current = "";
        String next = solution.nextWord(current);

        assertEquals("A", next);
    }

    @Test
    void whenCurrentWordIsA() {
        String current = "A";
        String next = solution.nextWord(current);

        assertEquals("AA", next);
    }

    @Test
    void whenCurrentWordIsAA() {
        String current = "AA";
        String next = solution.nextWord(current);

        assertEquals("AAA", next);
    }

    @Test
    void whenCurrentWordLengthIsLessThen5() {
        String current = "AAAA";
        String next = solution.nextWord(current);

        assertEquals("AAAAA", next);
    }

    @Test
    void wordNextAAAAAShouldBeAAAAE() {
        String current = "AAAAA";
        String next = solution.nextWord(current);

        assertEquals("AAAAE", next);
    }

    @Test
    void wordNextAAAAEShouldBeAAAAI() {
        String current = "AAAAE";
        String next = solution.nextWord(current);

        assertEquals("AAAAI", next);
    }

    @Test
    void wordNextAAAAUShouldBeAAAE() {
        String current = "AAAAU";
        String next = solution.nextWord(current);

        assertEquals("AAAE", next);
    }

    @Test
    void wordNextAUUUUShouldBeE() {
        String current = "AUUUU";
        String next = solution.nextWord(current);

        assertEquals("E", next);
    }

    @Test
    void EisAfterA() {
        String current = "A";
        String next = solution.getNextCharacter(current);

        assertEquals("E", next);
    }

    @Test
    void IisAfterE() {
        String current = "E";
        String next = solution.getNextCharacter(current);

        assertEquals("I", next);
    }

    @Test
    void OisAfterI() {
        String current = "E";
        String next = solution.getNextCharacter(current);

        assertEquals("I", next);
    }
}

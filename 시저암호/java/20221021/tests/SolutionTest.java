package tests;

import models.Letter;
import org.junit.jupiter.api.Test;
import solution.Solution;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void convertInputToLetter() {
        Solution solution = new Solution();
        List<Letter> letters = solution.convert("AB");

        assertEquals(List.of(
                new Letter("A"),
                new Letter("B")
        ), letters);
    }

    @Test
    void pushOne() {
        Solution solution = new Solution();
        List<Letter> letters = solution.convert("AB");
        List<Letter> pushedLetters = solution.push(letters, 1);

        assertEquals(List.of(
                new Letter("B"),
                new Letter("C")
        ), pushedLetters);
    }

    @Test
    void lettersToString() {
        Solution solution = new Solution();
        List<Letter> letters = solution.convert("a B z");
        List<Letter> pushedLetters = solution.push(letters, 4);

        String string = solution.lettersToString(pushedLetters);

        assertEquals("e F d", string);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        String result = solution.solution("a B z", 4);

        assertEquals("e F d", result);
    }
}

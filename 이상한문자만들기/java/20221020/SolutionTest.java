import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class SolutionTest {
    private List<Letter> defaultLetters = new ArrayList<>();

    @BeforeEach
    void makeLetters() {
        Solution solution = new Solution();
        defaultLetters = solution.letters("try hello world");
    }

    @Test
    void characters() {
        Solution solution = new Solution();
        String word = "try hello world";
        List<Letter> letters = solution.letters(word);

        assertEquals(letters.size(), word.length());
    }

    @Test
    void weirdString() {
        Solution solution = new Solution();
        String weirdString = solution.toWeirdString(defaultLetters);

        assertEquals("TrY HeLlO WoRlD", weirdString);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        String weird = solution.solution("  tRy hello  WORLD    ");

        assertEquals("  TrY HeLlO  WoRlD    ", weird);
    }
}

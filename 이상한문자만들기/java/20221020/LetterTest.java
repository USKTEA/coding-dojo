import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void creation() {
        boolean shouldUpper = false;
        Letter letter = new Letter("a", shouldUpper);

        assertEquals("a", letter.value());
    }

    @Test
    void string() {
        boolean firstLetterAfterBlank = false;
        boolean shouldUpper = false;
        Letter letter = new Letter("a", shouldUpper);

        assertEquals("a", letter.toString());
    }

    @Test
    void upperOrNot() {
        boolean shouldUpper = false;
        Letter letter1 = new Letter("a", shouldUpper);

        assertEquals("a", letter1.toString());

        shouldUpper = true;
        Letter letter2 = new Letter("a", shouldUpper);

        assertEquals("A", letter2.toString());
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class NumbersTest {

    @Test
    void creation() {
        Numbers numbers = new Numbers(new int[]{1, 2, 3});

        assertNotNull(numbers);
    }

    @Test
    void checkHasProperNumbers() {
        Numbers numbers = new Numbers(new int[]{1, 2, 3});

        assertEquals(new Numbers(new int[]{1, 2, 3}), numbers.getNumbers());
    }

    @Test
    void get() {
        Numbers numbers = new Numbers(new int[]{1, 2, 3});

        assertEquals(1, numbers.get(0));
    }
}

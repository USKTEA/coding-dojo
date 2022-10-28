import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toArray() {
        Solution solution = new Solution();
        String[] array = solution.toArray("one");

        assertArrayEquals(new String[] {"o","n", "e"}, array);

    }

    @Test
    void toArrayIncludeNumber() {
        Solution solution = new Solution();
        String[] array = solution.toArray("one1two2");

        assertArrayEquals(new String[] {"o", "n", "e", "1", "t", "w", "o", "2"}, array);
    }

    @Test
    void answer() {
        Solution solution = new Solution();
        String[] password = new String[] {"o", "n", "e", "1", "t", "w", "o", "2"};

        int number = solution.decrypt(password);

        assertEquals(1122, number);
    }

    @Test
    void difficult() {
        Solution solution = new Solution();
        String[] password = "one4seveneight".split("");

        int number = solution.decrypt(password);

        assertEquals(1478, number);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void string() {
        Solution solution = new Solution();
        String number = solution.string(12345);

        assertEquals("12345", number);
    }

    @Test
    void toArray() {
        Solution solution = new Solution();
        String number = solution.string(12345);

        assertArrayEquals(new String[] {"1","2","3","4","5"}, solution.toArray(number));
    }

    @Test
    void reverse() {
        Solution solutions = new Solution();

        String[] array = new String[]{"1", "2", "3", "4", "5"};
        assertEquals("54321", solutions.reverse(array));
    }

    @Test
    void toIntArray() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {5,4,3,2,1}, solution.toIntArray("54321"));
    }
}

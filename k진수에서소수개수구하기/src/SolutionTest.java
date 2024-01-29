import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void changeRadix() {
        Solution solution = new Solution();
        String translated = solution.changeRadix(437674, 3);

        assertEquals("211020101011", translated);
    }

    @Test
    void split() {
        Solution solution = new Solution();
        String[] numbers = solution.split("211020101011");

        assertArrayEquals(new String[]{"211", "2", "1", "1", "11"}, numbers);
    }

    @Test
    void countPrimeNumber() {
        Solution solution = new Solution();
        int counts = solution.countPrimeNumber(new String[]{"211", "2", "1", "1", "11"});

        assertEquals(3, counts);
    }

    @Test
    void isPrime() {
        Solution solution = new Solution();
        boolean result = solution.isPrime("1");

        assertFalse(result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(110011, 10);

        assertEquals(2, answer);
    }
}

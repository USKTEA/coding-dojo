import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] arrayA = new int[]{10, 20};
        int[] arrayB = new int[]{5, 17, 20};

        int result = solution.solution(arrayA, arrayB);

        assertEquals(0, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] arrayA = new int[]{14, 35, 119};
        int[] arrayB = new int[]{18, 30, 102};

        int result = solution.solution(arrayA, arrayB);

        assertEquals(7, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int[] arrayA = new int[]{10, 17};
        int[] arrayB = new int[]{5, 20};

        int result = solution.solution(arrayA, arrayB);

        assertEquals(0, result);
    }

    @Test
    void factors() {
        Solution solution = new Solution();
        List<Integer> factors = solution.factors(12);


        assertEquals(List.of(12, 6, 4, 3, 2), factors);
    }

    @Test
    void commonFactor() {
        Solution solution = new Solution();

        List<Integer> commonFactors = solution.commonFactor(new int[]{12, 15, 18, 24, 36});

        int[] factors = commonFactors
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        assertArrayEquals(new int[]{3}, factors);
    }
}

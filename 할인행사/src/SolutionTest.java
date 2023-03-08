import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toMap() {
        Solution solution = new Solution();
        String[] wants = new String[]{"banana", "apple", "rice", "pork", "pot"};
        int[] numbers = new int[]{3, 2, 2, 2, 1};

        Map<String, Integer> wish = solution.toMap(wants, numbers);

        assertEquals(
                Map.of("banana", 3,
                        "apple", 2,
                        "rice", 2,
                        "pork", 2,
                        "pot", 1), wish);
    }

    @Test
    void toCase() {
        Solution solution = new Solution();
        String[] discounts = new String[]{
                "chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice",
                "pot", "banana"
        };

        List<Map<String, Integer>> cases = solution.toCases(discounts, 10);

        List<Map<String, Integer>> assertion = List.of(
                Map.of(
                        "chicken", 1,
                        "apple", 3,
                        "banana", 2,
                        "rice", 2,
                        "pork", 2
                ),
                Map.of(
                        "apple", 3,
                        "banana", 2,
                        "rice", 2,
                        "pork", 2,
                        "pot", 1
                ),
                Map.of(
                        "apple", 2,
                        "banana", 3,
                        "rice", 2,
                        "pork", 2,
                        "pot", 1
                )
        );

        assertEquals(assertion, cases);
    }

    @Test
    void countSatisfiedCases() {
        Solution solution = new Solution();

        Map<String, Integer> wish = Map.of("banana", 3, "apple", 2, "rice", 2, "pork", 2, "pot", 1);

        List<Map<String, Integer>> cases = List.of(
                Map.of("banana", 3, "apple", 2, "rice", 2, "pork", 2, "pot", 1)
        );

        int result = solution.countSatisfiedCases(wish, cases);

        assertEquals(1, result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        String[] want = new String[]{"banana", "apple", "rice", "pork", "pot"};
        int[] number = new int[]{3, 2, 2, 2, 1};
        String[] discount = new String[]{"chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int answer = solution.solution(want, number, discount);

        assertEquals(3, answer);
    }
}

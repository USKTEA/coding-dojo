import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void solution() {
        String[] result = solution.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});

        assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, result);
    }

    @Test
    void noCombination() {
        HashMap<String, Integer> combinations = solution.combinations(new String[]{"AB", "AC"}, 3);

        assertEquals(Map.of(), combinations);
    }

    @Test
    void twoCombinations() {
        HashMap<String, Integer> combinations = solution.combinations(new String[]{"AB", "AC"}, 2);

        assertEquals(Map.of("AB", 1, "AC", 1), combinations);
    }

    @Test
    void threeCombinations() {
        HashMap<String, Integer> combinations = solution.combinations(new String[]{"AB", "AC", "CD"}, 2);

        assertEquals(Map.of("AB", 1, "AC", 1, "CD", 1), combinations);
    }

    @Test
    void oneCombinationsWithLength3() {
        HashMap<String, Integer> combinations = solution.combinations(new String[]{"ABC"}, 2);

        assertEquals(Map.of("AB", 1, "BC", 1, "AC", 1), combinations);
    }

    @Test
    void possibleDishes() {
        List<String> possibleDishes = solution.possibles("ABC", 2, "", new ArrayList<>(), 0);

        assertEquals(List.of("AB", "AC", "BC"), possibleDishes);
    }
}

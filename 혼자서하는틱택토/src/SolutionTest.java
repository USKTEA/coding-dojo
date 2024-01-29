import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"O.X", ".O.", "..X"});

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"...", ".O.", "..."});

        assertEquals(1, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"OOO", "...", "XXX"});

        assertEquals(0, result);
    }

    @Test
    void solution4() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"OXX", "XOO", ".XO"});

        assertEquals(0, result);
    }

    @Test
    void solution5() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"OOO", "XOX", "XXO"});

        assertEquals(1, result);
    }

    @Test
    void solution6() {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"OOX", "OXO", "XOO"});

        assertEquals(0, result);
    }

    @Test
    void countPieces() {
        Solution solution = new Solution();
        Map<String, Integer> pieces = solution.countPieces(new String[]{"O.X", ".O.", "..X"});

        assertEquals(Map.of(
                "O", 2,
                "X", 2
        ), pieces);
    }

    @Test
    void checkPiecesMatchRule() {
        Solution solution = new Solution();
        boolean result = solution.checkPiecesMatchRule(Map.of(
                "O", 2,
                "X", 2
        ));

        assertTrue(result);
    }

    @Test
    void columns() {
        Solution solution = new Solution();
        String[] columns = solution.columns(new String[]{"OOX", "O.X", "OXX"});

        assertArrayEquals(new String[]{"OOO", "O.X", "XXX"}, columns);
    }

    @Test
    void crosses() {
        Solution solution = new Solution();
        String[] crosses = solution.crosses(new String[]{"OXX", "XOO", "..O"});

        assertArrayEquals(new String[] {"OOO", "XO."}, crosses);
    }
}

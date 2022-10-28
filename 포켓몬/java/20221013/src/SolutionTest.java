import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test
    void getSet() {
        Solution solution = new Solution();
        HashSet<Integer> set = solution.toSet(new int[]{3, 1, 2, 3});

        assertEquals(3, set.size());
    }

    @Test
    void choose() {
        Solution solution = new Solution();
        int amount = solution.choose(2, 3);

        assertEquals(2, amount);
    }
}

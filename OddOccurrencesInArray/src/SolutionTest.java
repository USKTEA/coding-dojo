import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void fillList() {
        Solution solution = new Solution();
        assertEquals(List.of(2), solution.findOdd(new int[]{1, 1, 2}));
    }

    @Test
    void listToInt() {
        Solution solution = new Solution();
        assertEquals(2, solution.toInt(List.of(2)));
    }
}

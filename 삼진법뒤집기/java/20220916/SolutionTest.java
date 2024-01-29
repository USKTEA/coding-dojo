import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void reversedTernary() {
        Solution solution = new Solution();
        List<Integer> ternary = solution.ternary(45);
        List<Integer> expect = new ArrayList<>();
        expect.add(0);
        expect.add(0);
        expect.add(2);
        expect.add(1);

        assertEquals(expect, ternary);
    }

    @Test
    void decimal() {
        Solution solution = new Solution();
        List<Integer> ternary = new ArrayList<>();
        ternary.add(0);
        ternary.add(0);
        ternary.add(2);
        ternary.add(1);

        int expect = solution.decimal(ternary);

        assertEquals(7, expect);
    }
}

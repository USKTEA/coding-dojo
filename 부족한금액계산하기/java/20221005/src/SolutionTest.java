import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sum() {
        Solution solution = new Solution();
        int price = 3;
        int count = 4;

        assertEquals(30, solution.sum(price, count));
    }

    @Test
    void canAfford() {
        Solution solution = new Solution();
        int money = 30;
        int price = 40;

        assertFalse(solution.canAfford(money, price));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeesawTest {
    @Test
    void isBalanced() {
        int[] meters = new int[] {2, 3, 4};

        Seesaw seesaw = new Seesaw(meters);

        boolean result = seesaw.isBalanced(270, 360);

        assertTrue(result);
    }
}

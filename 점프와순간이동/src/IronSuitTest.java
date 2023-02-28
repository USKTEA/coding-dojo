import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronSuitTest {
    @Test
    void calculateBatteryUsage() {
        IronSuit ironSuit = new IronSuit();

        int distance = 5;

        int result = ironSuit.calculateBatteryUsage(distance);

        assertEquals(2, result);
    }
}

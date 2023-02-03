import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ParkingSystemTest {
    @Test
    void calculate1() {
        ParkingSystem parkingSystem = new ParkingSystem();
        Rule rule = Rule.of(new int[]{1, 461, 1, 10});
        ParkingRecord record = new ParkingRecord("00:00 1234 IN");

        int[] result = parkingSystem.calculate(rule, List.of(record));

        assertArrayEquals(result, new int[]{14841});
    }
}

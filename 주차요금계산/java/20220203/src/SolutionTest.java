import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private ParkingSystem parkingSystem;
    private Solution solution;

    @BeforeEach
    void setup() {
        parkingSystem = new ParkingSystem();
        solution = new Solution(parkingSystem);
    }

    @Test
    void toRecord() {
        List<ParkingRecord> records = solution.toRecords(new String[]{"00:00 1234 IN"});

        assertEquals(records.get(0).time(), 0);
        assertEquals(records.get(0).carNumber(), "1234");
        assertEquals(records.get(0).process(), "IN");
    }

    @Test
    void toFee() {
        Rule rule = solution.toFee(new int[]{180, 5000, 10, 600});

        assertEquals(rule.basicTime(), 180);
    }

    @Test
    void solution() {
        int[] results = solution.solution(new int[]{1, 461, 1, 10}, new String[]{"00:00 1234 IN"});

        assertArrayEquals(results, new int[]{14841});
    }

    @Test
    void solution2() {
        int[] results = solution.solution(
                new int[] {180, 5000, 10, 600},
                new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT",
                        "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN",
                        "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});

        assertArrayEquals(results, new int[] {14600, 34400, 5000});
    }

    @Test
    void solution3() {
        int[] results = solution.solution(
                new int[] {180, 5000, 10, 600},
                new String[] {"06:00 0000 IN", "06:34 0000 OUT", "18:59 0000 IN"});

        assertArrayEquals(results, new int[] {14600});
    }

    @Test
    void solution4() {
        int[] results = solution.solution(
                new int[] {120, 0, 60, 591},
                new String[] {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"}
        );

        assertArrayEquals(results, new int[]{0, 591});
    }
}

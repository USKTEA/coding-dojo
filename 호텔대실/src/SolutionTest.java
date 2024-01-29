import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toReservation() {
        Solution solution = new Solution();
        List<Reservation> reservations = solution.toReservation(new String[][]{{"15:00", "17:00"}, {"14:20", "15:20"}});

        assertEquals(2, reservations.size());
        assertEquals(860, reservations.get(0).getStart());
    }

    @Test
    void countRoomsToUse() {
        Solution solution = new Solution();
        int counts = solution.countRoomsToUse(List.of(
                new Reservation("10:20", "12:30"),
                new Reservation("10:20", "12:30"),
                new Reservation("10:20", "12:30")));

        assertEquals(3, counts);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}});

        assertEquals(1, answer);
    }
}

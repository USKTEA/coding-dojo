import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void creation() {
        Reservation reservation = new Reservation("15:00", "17:00");

        assertEquals(900, reservation.getStart());
        assertEquals(1020, reservation.getEnd());
    }
}

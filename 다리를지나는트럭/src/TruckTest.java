import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void move() {
        Truck truck = new Truck(10);

        assertEquals(0, truck.position());

        truck.move();

        assertEquals(1, truck.position());
    }
}

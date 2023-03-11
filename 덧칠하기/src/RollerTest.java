import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollerTest {
    @Test
    void creation() {
        Roller roller = new Roller(4);

        assertEquals(4, roller.getLength());
    }

    @Test
    void paint() {
        Roller roller = new Roller(1);

        assertEquals(0, roller.position());

        roller.paint(1);

        assertEquals(2, roller.position());
    }
}

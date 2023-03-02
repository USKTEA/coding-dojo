import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void creation() {
        Box box = new Box(0, 3);

        assertEquals(4, box.value());
    }
}

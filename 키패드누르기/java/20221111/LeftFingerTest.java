import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftFingerTest {

    @Test
    void startPosition() {
        Finger leftFinger = new LeftFinger();

        int startPosition = leftFinger.position();

        assertEquals(10, startPosition);
    }

    @Test
    void type() {
        Finger leftFinger = new LeftFinger();

        String result = leftFinger.type(1);

        assertEquals("L", result);
        assertEquals(1, leftFinger.position());
    }
}

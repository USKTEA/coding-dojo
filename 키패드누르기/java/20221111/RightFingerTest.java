import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightFingerTest {

    @Test
    void startPosition() {
        Finger rightFinger = new RightFinger();

        int startPosition = rightFinger.position();

        assertEquals(12, startPosition);
    }

    @Test
    void type() {
        Finger rightFinger = new RightFinger();

        String result = rightFinger.type(3);

        assertEquals(3,rightFinger.position());
        assertEquals("R", result);
    }
 }

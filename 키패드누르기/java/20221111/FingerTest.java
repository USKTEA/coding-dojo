import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FingerTest {

    @Test
    void type() {
        Finger finger = new Finger();

        finger.type(1);

        int position = finger.position();

        assertEquals(1, position);
    }

    @Test
    void calculateDistance() {
        Finger finger = new Finger();

        finger.type(1);

        int distance1 = finger.calculate(4);
        int distance2 = finger.calculate(7);
        int distance3 = finger.calculate(2);
        int distance4 = finger.calculate(5);
        int distance5 = finger.calculate(9);
        int distance6 = finger.calculate(11);

        assertEquals(1, distance1);
        assertEquals(2, distance2);
        assertEquals(1, distance3);
        assertEquals(2, distance4);
        assertEquals(4, distance5);
        assertEquals(4, distance6);
    }
}

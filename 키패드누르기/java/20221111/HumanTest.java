import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void hasFingers() {
        Human rightHanded = new Human("right");

        Finger rightFinger = rightHanded.rightFinger();
        Finger leftFinger = rightHanded.leftFinger();

        assertTrue(rightFinger.isPrior());
        assertFalse(leftFinger.isPrior());
    }

    @Test
    void type147() {
        Human rightHanded = new Human("right");

        String typedWith1 = rightHanded.type(1);

        assertEquals("L", typedWith1);

        String typedWith2 = rightHanded.type(4);

        assertEquals("L", typedWith2);

        String typedWith3 = rightHanded.type(7);

        assertEquals("L", typedWith3);
    }

    @Test
    void type369() {
        Human rightHanded = new Human("right");

        String typedWith1 = rightHanded.type(3);

        assertEquals("R", typedWith1);

        String typedWith2 = rightHanded.type(6);

        assertEquals("R", typedWith2);

        String typedWith3 = rightHanded.type(9);

        assertEquals("R", typedWith3);
    }

    @Test
    void type13458214595() {
        Human rightHanded = new Human("right");

        String typeWith1 = rightHanded.type(1);
        String typeWith2 = rightHanded.type(3);
        String typeWith3 = rightHanded.type(4);
        String typeWith4 = rightHanded.type(5);
        String typeWith5 = rightHanded.type(8);
        String typeWith6 = rightHanded.type(2);
        String typeWith7 = rightHanded.type(1);
        String typeWith8 = rightHanded.type(4);
        String typeWith9 = rightHanded.type(5);
        String typeWith10 = rightHanded.type(9);
        String typeWith11 = rightHanded.type(5);

        assertEquals("L", typeWith1);
        assertEquals("R", typeWith2);
        assertEquals("L", typeWith3);
        assertEquals("L", typeWith4);
        assertEquals("L", typeWith5);
        assertEquals("R", typeWith6);
        assertEquals("L", typeWith7);
        assertEquals("L", typeWith8);
        assertEquals("R", typeWith9);
        assertEquals("R", typeWith10);
        assertEquals("L", typeWith11);
    }
}

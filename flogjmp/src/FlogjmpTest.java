import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlogjmpTest {

    @Test
    void distance() {
        Flogjmp flogjmp = new Flogjmp();
        assertEquals(9, flogjmp.distance(1, 10));
        assertEquals(1, flogjmp.distance(999999999, 1000000000));
    }

    @Test
    void times() {
        Flogjmp flogjmp = new Flogjmp();

        assertEquals(1, flogjmp.jump(3, 3));
        assertEquals(2, flogjmp.jump(4, 3));
    }
}

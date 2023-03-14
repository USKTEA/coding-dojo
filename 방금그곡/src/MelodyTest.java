import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MelodyTest {
    @Test
    void of() {
        Melody melody = Melody.of("CC#BCC#BCC#BCC#B");

        assertEquals("cCbcCbcCbcCb", melody.note());
    }

    @Test
    void contains() {
        Melody melody1 = Melody.of("CDEFGABCDEFGAB");
        Melody melody2 = Melody.of("ABCDEFG");

        assertTrue(melody1.contains(melody2));
    }
}

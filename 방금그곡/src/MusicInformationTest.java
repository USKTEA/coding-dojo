import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicInformationTest {
    @Test
    void of() {
        MusicInformation musicInformation = MusicInformation.of("12:00,12:14,HELLO,CDEFGAB");

        assertEquals(720, musicInformation.start());
        assertEquals(734, musicInformation.end());
        assertEquals("HELLO", musicInformation.title());
        assertEquals(Melody.of("CDEFGAB"), musicInformation.melody());
        assertEquals(Melody.of("CDEFGABCDEFGAB"), musicInformation.played());
    }

    @Test
    void containMelody() {
        MusicInformation musicInformation = MusicInformation.of("12:00,12:14,HELLO,CDEFGAB");

        assertTrue(musicInformation.containMelody(Melody.of("ABCDEFG")));
    }
}

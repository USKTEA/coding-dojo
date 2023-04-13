import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicRecordTest {
    @Test
    void add() {
        String genre = "classic";

        MusicRecord musicRecord = new MusicRecord(genre);
        int recordPlays = musicRecord.plays();

        assertEquals(0, recordPlays);

        musicRecord.add(new Music(1, "classic", 1500));

        assertEquals(recordPlays + 1500, musicRecord.plays());
    }
}

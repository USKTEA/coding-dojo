import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RecorderTest {
    @Test
    void record() {
        Map<String, MusicRecord> records = new HashMap<>();
        records.put("classic", MusicRecord.fake("classic", 1500, 1));
        records.put("pop", MusicRecord.fake("pop", 3100, 3));

        Recorder recorder = new Recorder();
        List<Music> musics = recorder.record(records);

        int[] ids = musics.stream()
                .mapToInt(Music::id)
                .toArray();

        assertArrayEquals(new int[]{3, 4, 1, 2}, ids);
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] solution(String[] genres, int[] plays) {
        Map<String, MusicRecord> records = new HashMap<>();

        for (int i = 0; i < genres.length; i += 1) {
            MusicRecord record = records.getOrDefault(genres[i], new MusicRecord(genres[i]));

            record.add(new Music(i, genres[i], plays[i]));

            records.put(genres[i], record);
        }

        Recorder recorder = new Recorder();
        List<Music> musics = recorder.record(records);

        return musics.stream()
                .mapToInt(Music::id)
                .toArray();
    }
}

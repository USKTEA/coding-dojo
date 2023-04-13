import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Recorder {
    public List<Music> record(Map<String, MusicRecord> records) {
        ArrayList<MusicRecord> musicRecords = records.values()
                .stream()
                .collect(Collectors.toCollection(ArrayList::new));

        musicRecords.sort((a, b) -> b.plays() - a.plays());

        List<Music> musics = new ArrayList<>();

        for (MusicRecord musicRecord: musicRecords) {
            for (int i = 0; i < 2; i += 1) {
                Music popular = musicRecord.popular();

                if (Objects.nonNull(popular)) {
                    musics.add(popular);
                }
            }
        }

        return musics;
    }
}

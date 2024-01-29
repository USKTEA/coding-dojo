import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String m, String[] musicinfos) {
        List<MusicInformation> musicInformations = new ArrayList<>();
        List<MusicInformation> candidates = new ArrayList<>();

        Melody melody = Melody.of(m);

        for (String information : musicinfos) {
            musicInformations.add(MusicInformation.of(information));
        }

        musicInformations.forEach(musicInformation -> {
            if (musicInformation.containMelody(melody)) {
                candidates.add(musicInformation);
            }
        });

        if (candidates.size() == 0) {
            return "(None)";
        }

        if (candidates.size() == 1) {
            return candidates.get(0).title();
        }

        if (candidates.size() > 1) {
            Collections.sort(candidates);
        }

        return candidates.get(0).title();
    }
}

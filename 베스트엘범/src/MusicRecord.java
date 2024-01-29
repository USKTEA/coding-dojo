import java.util.PriorityQueue;

public class MusicRecord {
    private String genre;
    private int plays;
    private PriorityQueue<Music> musics;

    public MusicRecord(String genre) {
        this.genre = genre;
        musics = new PriorityQueue<>((a, b) -> {
            if (a.plays() == b.plays()) {
                return a.id() - b.id();
            }

            return b.plays() - a.plays();
        });
    }

    public static MusicRecord fake(String genre, int plays, int id) {
        MusicRecord musicRecord = new MusicRecord(genre);
        musicRecord.add(new Music(id, genre, plays - 100));
        musicRecord.add(new Music(id + 1, genre, 100));

        return musicRecord;
    }

    public void add(Music music) {
        this.musics.add(music);
        this.plays += music.plays();
    }

    public int plays() {
        return plays;
    }

    public Music popular() {
        if (!musics.isEmpty()) {
            return musics.poll();
        }

        return null;
    }
}

public class MusicInformation implements Comparable {
    private final int start;
    private final int end;
    private final String title;
    private final Melody melody;
    private final Melody played;

    public MusicInformation(String information) {
        String[] informations = information.split(",");

        this.start = toMinute(informations[0]);
        this.end = toMinute(informations[1]);
        this.title = informations[2];
        this.melody = Melody.of(informations[3]);
        this.played = setPlayed(informations[3]);
    }

    private Melody setPlayed(String note) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] notes = note.split("");

        for (int i = 0; i < this.end - this.start; i += 1) {
            stringBuilder.append(notes[i % notes.length]);
        }

        return Melody.of(stringBuilder.toString());
    }

    private int toMinute(String information) {
        String[] time = information.split(":");

        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public static MusicInformation of(String information) {
        return new MusicInformation(information);
    }

    public int start() {
        return start;
    }

    public int end() {
        return end;
    }

    public String title() {
        return title;
    }

    public Melody melody() {
        return melody;
    }

    public Melody played() {
        return played;
    }

    public boolean containMelody(Melody melody) {
        return this.played.contains(melody);
    }

    @Override
    public int compareTo(Object other) {
        MusicInformation otherMusic = (MusicInformation) other;

        int playtime = this.end - this.start;
        int otherPlaytime = otherMusic.end - otherMusic.start;

        if (otherPlaytime - playtime == 0) {
            return this.start - otherMusic.start;
        }

        return otherPlaytime - playtime;
    }
}

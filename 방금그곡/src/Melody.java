import java.util.Objects;

public class Melody {
    private String note;

    public Melody(String note) {
        setValue(note);
    }

    private void setValue(String note) {
        String[] notes = note.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < notes.length; i += 1) {
            if (Objects.equals(notes[i], "#")) {
                continue;
            }

            if (i + 1 < notes.length && Objects.equals(notes[i + 1], "#")) {
                stringBuilder.append(notes[i]);

                continue;
            }

            stringBuilder.append(notes[i].toLowerCase());
        }

        this.note = stringBuilder.toString();
    }

    public static Melody of(String m) {
        return new Melody(m);
    }

    public String note() {
        return note;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Melody melody = (Melody) object;

        return Objects.equals(note, melody.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }

    public boolean contains(Melody melody) {
        return this.note.contains(melody.note);
    }
}

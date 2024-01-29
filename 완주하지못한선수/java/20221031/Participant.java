import java.util.Objects;

public class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    @Override
    public boolean equals(Object other) {
        Participant otherParticipant = (Participant) other;

        return Objects.equals(name, otherParticipant.getName());
    }
}

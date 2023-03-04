import java.util.Objects;

public class Document {
    private int location;
    private int priority;

    public Document(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Document document = (Document) object;

        return location == document.location && priority == document.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, priority);
    }

    public int priority() {
        return priority;
    }

    public int location() {
        return location;
    }
}

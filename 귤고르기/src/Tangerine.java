import java.util.Objects;

public class Tangerine {
    private int size;
    private int counts;

    public Tangerine(int size, int counts) {
        this.size = size;
        this.counts = counts;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Tangerine tangerine = (Tangerine) object;

        return size == tangerine.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    public int counts() {
        return counts;
    }

    public int size() {
        return size;
    }
}

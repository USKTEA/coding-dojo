import java.util.Objects;

public class Box {
    private int x;
    private int y;
    private int value;

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        setValue(x, y);
    }

    private void setValue(int x, int y) {
        this.value = Math.max(x +1, y + 1);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Box box = (Box) object;
        return x == box.x && y == box.y && value == box.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, value);
    }

    public int value() {
        return value;
    }
}

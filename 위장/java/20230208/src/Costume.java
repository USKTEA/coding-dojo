import java.util.Objects;

public class Costume {
    private String part;
    private String name;

    public Costume(String name, String part) {
        this.name = name;
        this.part = part;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Costume costume = (Costume) object;
        return Objects.equals(part, costume.part) && Objects.equals(name, costume.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(part, name);
    }

    public String part() {
        return part;
    }
}

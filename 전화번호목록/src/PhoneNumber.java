import java.util.Locale;
import java.util.Objects;

public class PhoneNumber {
    private final String value;

    public PhoneNumber(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        PhoneNumber that = (PhoneNumber) object;

        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public boolean isPrefix(PhoneNumber phoneNumber) {
        if (this.value.startsWith(phoneNumber.value) || phoneNumber.value.startsWith(this.value)) {
            return true;
        }

        return false;
    }

    public String value() {
        return value;
    }
}

import java.util.Objects;

public class File implements Comparable {
    private final String name;
    private final String number;
    private final String tail;

    public File(String name, String number, String tail) {
        this.name = name;
        this.number = number;
        this.tail = tail;
    }

    @Override
    public int compareTo(Object other) {
        File otherFile = (File) other;
        String lowerCaseName = name.toLowerCase();
        String otherLowerCaseName = otherFile.name.toLowerCase();

        if (lowerCaseName.compareTo(otherLowerCaseName) == 0) {
            int formattedNumber = format(number);
            int otherFormattedNumber = format(otherFile.number);

            return formattedNumber - otherFormattedNumber;
        }

        return lowerCaseName.compareTo(otherLowerCaseName);
    }

    private int format(String number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number.length(); i += 1) {
            if (number.charAt(i) == '0' && stringBuilder.length() == 0) {
                continue;
            }

            stringBuilder.append(number.charAt(i));
        }

        return Integer.parseInt(stringBuilder.toString());
    }

    @Override
    public String toString() {
        return name + number + tail;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        File file = (File) object;

        return Objects.equals(name, file.name)
                && Objects.equals(number, file.number)
                && Objects.equals(tail, file.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, tail);
    }
}

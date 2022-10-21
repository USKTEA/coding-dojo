package models;

public class Letter {
    private String value;

    public Letter(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        Letter otherLetter = (Letter) other;

        return this.value.equals(otherLetter.value);
    }

    @Override
    public String toString() {
        return value;
    }

    public boolean isBlank() {
        return value.equals(" ") ? true : false;
    }

    public Letter push(int number) {
        int asciiCode = value.getBytes()[0];

        return getPushedLetter(number, asciiCode);
    }

    private Letter getPushedLetter(int number, int asciiCode) {
        int upperCaseEnd = 'Z';
        int lowerCaseEnd = 'z';

        if (asciiCode == 32) {
            return this;
        }

        if (asciiCode + number > upperCaseEnd && asciiCode <= upperCaseEnd) {
            return new Letter(Character.toString(asciiCode + number - 26));
        }

        if (asciiCode + number > lowerCaseEnd) {
            return new Letter(Character.toString(asciiCode + number - 26));
        }

        return new Letter(Character.toString(asciiCode + number));
    }

    public String value() {
        return value;
    }
}

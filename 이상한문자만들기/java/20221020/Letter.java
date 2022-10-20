public class Letter {
    private String value;
    private boolean isUpper;

    public Letter(String value, boolean isUpper) {
        this.value = value;
        this.isUpper = isUpper;
    }

    public String value() {
        return value;
    }

    public String toString() {
        return isUpper ? value.toUpperCase() : value.toLowerCase();
    }

    public boolean isUpper() {
        return isUpper;
    }

    public boolean isBlank() {
        return value.equals(" ") ? true : false;
    }
}

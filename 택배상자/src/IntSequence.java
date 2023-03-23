public class IntSequence {
    private int max;
    private int current;

    public IntSequence(int max) {
        this.max = max;
        this.current = 1;
    }

    public static IntSequence of(int max) {
        return new IntSequence(max);
    }

    public void next() {
        current += 1;
    }

    public int checkNext() {
        return current;
    }
}

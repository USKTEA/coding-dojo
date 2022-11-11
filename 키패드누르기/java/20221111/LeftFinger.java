public class LeftFinger extends Finger {
    public LeftFinger() {
        this.position = 10;
    }

    @Override
    public int position() {
        return position;
    }

    @Override
    public String type(int number) {
        this.position = number;

        return "L";
    }
}

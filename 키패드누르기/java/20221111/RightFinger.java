public class RightFinger extends Finger {
    public RightFinger() {
        this.position = 12;
    }

    @Override
    public String type(int number) {
        this.position = number;

        return "R";
    }
}

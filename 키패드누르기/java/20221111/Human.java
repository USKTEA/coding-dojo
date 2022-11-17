import java.util.Objects;

public class Human {
    private final String priorHand;
    private Finger rightFinger = new RightFinger();
    private Finger leftFinger = new LeftFinger();

    public Human(String priorHand) {
        this.priorHand = priorHand;

        if (Objects.equals(priorHand, "left")) {
            leftFinger.setPrior(true);
        }

        if (Objects.equals(priorHand, "right")) {
            rightFinger.setPrior(true);
        }
    }

    public static Human of(String priorHand) {
        return new Human(priorHand);
    }

    public String priorHand() {
        return priorHand;
    }

    public Finger rightFinger() {
        return rightFinger;
    }

    public Finger leftFinger() {
        return leftFinger;
    }

    public String type(int number) {
        if (number == 1 || number == 4 || number == 7) {
            return leftFinger.type(number);
        }

        if (number == 3 || number == 6 || number == 9) {
            return rightFinger.type(number);
        }

        int distanceFromLeftFinger = leftFinger.calculate(number);

        int distanceFromRightFinger = rightFinger.calculate(number);

        if (distanceFromLeftFinger > distanceFromRightFinger) {
            return rightFinger.type(number);
        }

        if (distanceFromLeftFinger < distanceFromRightFinger) {
            return leftFinger.type(number);
        }

        if (distanceFromLeftFinger == distanceFromRightFinger && leftFinger.isPrior()) {
            return leftFinger.type(number);
        }

        return rightFinger.type(number);
    }
}

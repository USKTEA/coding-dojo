public class Finger {
    protected int position;
    private boolean isPrior = false;

    public boolean isPrior() {
        return isPrior;
    }

    public void setPrior(boolean isPrior) {
        this.isPrior = isPrior;
    }

    public int position() {
        return position;
    }

    public String type(int number) {
        this.position = number;

        return null;
    }

    public int calculate(int number) {
        return (int) Math.floor(Math.abs(this.position - number) / 3)
                + Math.abs(this.position - number) % 3;
    }
}

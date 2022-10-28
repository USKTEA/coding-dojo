public class Stage {
    private int stage;
    private int currentChallengers;
    private int totalChallengers;
    private double failedRate;

    public Stage(int stage) {
        this.stage = stage;
        this.currentChallengers = 0;
        this.totalChallengers = 0;
        this.failedRate = 0;
    }

    public int stage() {
        return stage;
    }

    public int getCurrentChallengers() {
        return currentChallengers;
    }

    public void addCurrentChallengers(int i) {
        currentChallengers = i;
    }

    public int getTotalChallengers() {
        return totalChallengers;
    }

    public void addTotalChallengers(int i) {
        totalChallengers = i;
    }

    public void setFailedRate(double failedRate) {
        this.failedRate = failedRate;
    }

    public double getFailedRate() {
        return failedRate;
    }

    @Override
    public String toString() {
        return Integer.toString(this.stage);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        Stage otherStage = (Stage) other;

        return this.stage() == otherStage.stage() ? true : false;
    }
}

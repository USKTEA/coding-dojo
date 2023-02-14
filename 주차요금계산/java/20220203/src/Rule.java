public class Rule {
    private int basicTime;
    private int basicRate;
    private int unitTime;
    private int unitRate;

    public Rule(int basicTime, int basicRate, int unitTime, int unitRate) {
        this.basicTime = basicTime;
        this.basicRate = basicRate;
        this.unitTime = unitTime;
        this.unitRate = unitRate;
    }

    public static Rule of(int[] fee) {
        return new Rule(
                fee[0],
                fee[1],
                fee[2],
                fee[3]
        );
    }

    public int basicTime() {
        return basicTime;
    }

    public int basicRate() {
        return basicRate;
    }

    public int unitTime() {
        return unitTime;
    }

    public int unitRate() {
        return unitRate;
    }
}

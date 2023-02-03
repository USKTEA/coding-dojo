import java.util.Objects;

public class Car {
    private final String number;
    private int parkingStart;
    private int totalParkingTime;
    private String status;

    public Car(String carNumber) {
        this.number = carNumber;
        this.totalParkingTime = 0;
    }

    public void out(int outTime) {
        this.totalParkingTime = outTime - parkingStart;
        this.status = "OUT";
    }

    public void in(int time) {
        this.parkingStart = time;
        this.status = "IN";
    }

    public int calculateParkingFee(Rule rule) {
        if (totalParkingTime <= rule.basicTime() && Objects.equals(this.status, "OUT")) {
            return rule.basicRate();
        }

        int additionalFee;

        if (Objects.equals(this.status, "OUT")) {
            int unitTimes = getTimes(totalParkingTime, rule.basicTime(), rule.unitTime());
            int last = getLast(totalParkingTime, rule.basicTime(), rule.unitTime());

            if (last > 0) {
                additionalFee = unitTimes * rule.unitRate() + rule.unitRate();

                return rule.basicRate() + additionalFee;
            }

            additionalFee = unitTimes * rule.unitRate();

            return rule.basicRate() + additionalFee;
        }

        totalParkingTime = 1439 - parkingStart + totalParkingTime;

        int last = getLast(totalParkingTime, rule.basicTime(), rule.unitTime());
        int unitTimes = getTimes(totalParkingTime, rule.basicTime(), rule.unitTime());

        if (last > 0) {
            additionalFee = unitTimes * rule.unitRate() + rule.unitRate();

            return rule.basicRate() + additionalFee;
        }

        additionalFee = unitTimes * rule.unitRate();

        return rule.basicRate() + additionalFee;
    }

    private int getLast(int totalParkingTime, int basicTime, int unitTime) {
        return (totalParkingTime - basicTime) % unitTime;
    }

    private int getTimes(int totalParkingTime, int basicTime, int unitTime) {
        return (totalParkingTime - basicTime) / unitTime;
    }

    public String number() {
        return number;
    }
}

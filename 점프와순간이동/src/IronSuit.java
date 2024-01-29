import java.util.Objects;

public class IronSuit {
    private int batteryUsage;
    private int jumpDistance;

    public IronSuit() {
        batteryUsage = 0;
        jumpDistance = 1;
    }

    public int calculateBatteryUsage(int distance) {
        if (distance == 0) {
            return batteryUsage;
        }

        if (distance % 2 != 0) {
            batteryUsage += 1;

            return calculateBatteryUsage(distance - jumpDistance);
        }

        return calculateBatteryUsage(distance / 2);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> trucks = new LinkedList<>();
        Bridge bridge = new Bridge(bridgeLength, weight);
        int second = 0;

        for (int truckWeight : truckWeights) {
            trucks.add(new Truck(truckWeight));
        }

        while (!trucks.isEmpty() || bridge.hasTruck()) {
            second += 1;

            if (bridge.hasTruck()) {
                bridge.carMoves();
            }

            if (!trucks.isEmpty()) {
                Truck truck = trucks.peek();

                if (bridge.canAccept(truck)) {
                    bridge.accept(trucks.poll());
                }
            }
        }

        return second;
    }

    private class Bridge {
        private int bridgeLength;
        private int weight;
        private List<Truck> trucks;

        public Bridge(int bridgeLength, int weight) {
            this.bridgeLength = bridgeLength;
            this.weight = weight;
            this.trucks = new ArrayList<>();
        }

        public boolean hasTruck() {
            return !trucks.isEmpty();
        }

        public void carMoves() {
            for (Truck truck : trucks) {
                truck.move();
            }

            checkTruck();
        }

        private void checkTruck() {
            Truck truck = trucks.get(0);

            if (truck.position() >= bridgeLength) {
                trucks.remove(truck);
            }
        }

        public void accept(Truck truck) {
            this.trucks.add(truck);
        }

        public boolean canAccept(Truck truck) {
            return bridgeLength >= trucks.size() + 1 && weight >= totalWeight() + truck.weight();
        }

        private int totalWeight() {
            int weight = 0;

            for (Truck truck : trucks) {
                weight += truck.weight();
            }

            return weight;
        }
    }
}

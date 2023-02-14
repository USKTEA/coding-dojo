import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ParkingSystem {
    private Map<String, Car> cars = new HashMap<>();

    public int[] calculate(Rule rule, List<ParkingRecord> records) {
        record(records);

        List<Car> sorted = sort(cars);

        return sorted.stream()
                .map((car) -> car.calculateParkingFee(rule))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private List<Car> sort(Map<String,Car> cars) {
        Comparator<Car> comparator = Comparator.comparingInt(car -> Integer.parseInt(car.number()));

        ArrayList<Car> sorted = cars.values().stream().collect(Collectors.toCollection(ArrayList::new));

        Collections.sort(sorted, comparator);

        return sorted;
    }

    private void record(List<ParkingRecord> records) {
        records.stream().forEach((record) -> {
            String carNumber = record.carNumber();
            String process = record.process();

            if (!cars.containsKey(carNumber)) {
                Car car = new Car(record.carNumber());

                cars.put(record.carNumber(), car);

                car.in(record.time());

                return;
            }

            Car car = cars.get(carNumber);

            if (Objects.equals(process, "OUT")) {
                car.out(record.time());

                return;
            }

            car.in(record.time());
        });
    }
}

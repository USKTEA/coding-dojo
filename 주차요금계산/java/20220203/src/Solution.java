import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private final ParkingSystem parkingSystem;

    public Solution(ParkingSystem parkingSystem) {
        this.parkingSystem = parkingSystem;
    }

    public List<ParkingRecord> toRecords(String[] records) {
        return Arrays.stream(records).map((record) -> new ParkingRecord(record))
                .collect(Collectors.toList());
    }

    public int[] solution(int[] fees, String[] strings) {
        List<ParkingRecord> records = toRecords(strings);
        Rule rule = Rule.of(fees);

        int[] results = parkingSystem.calculate(rule, records);

        return results;
    }

    public Rule toFee(int[] fee) {
        return Rule.of(fee);
    }
}

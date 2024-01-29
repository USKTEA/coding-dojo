import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public Costume toCostume(String[] item) {
        String name = item[0];
        String part = item[1];

        return new Costume(name, part);
    }

    public int solution(String[][] items) {
        List<Costume> costumes = Arrays.stream(items)
                .map((item) -> toCostume(item))
                .collect(Collectors.toList());

        Spy spy = Spy.of(costumes);

        return spy.variations();
    }
}

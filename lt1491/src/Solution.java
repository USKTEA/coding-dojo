import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public double average(int[] salary) {
        List<Integer> salaries = IntStream
                .range(0, salary.length)
                .mapToObj((index) -> salary[index])
                .collect(Collectors.toList());

        Collections.sort(salaries);

        double average = IntStream.range(1, salaries.size() - 1)
                .map((index) -> salaries.get(index))
                .average().getAsDouble();

        return average;
    }
}

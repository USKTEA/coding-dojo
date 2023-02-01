import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
    public List<List<String>> toSortedList(String s) {
        List<String> split = Arrays.stream(s.split("},\\{")).collect(Collectors.toList());

        return split.stream()
                .map(string -> Arrays
                        .stream(string.split(","))
                        .map(letter ->
                                Arrays.stream(letter.split(""))
                                        .filter((a) -> !Objects.equals(a, "{") && !Objects.equals(a, "}"))
                                        .collect(Collectors.joining())
                                )
                        .collect(Collectors.toList()))
                .sorted(Comparator.comparingInt(List::size))
                .collect(Collectors.toList());
    }

    public int[] toTuple(List<List<String>> list) {
        int[] tuple = TupleBuilder.build(list);

        return tuple;
    }
}

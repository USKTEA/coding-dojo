import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int solution(int[] numbers1, int[] numbers2) {
        List<Integer> sorted1 = sortAsc(numbers1);
        List<Integer> sorted2 = sortDsc(numbers2);

        return sumMultiplies(sorted1, sorted2, 0, 0);
    }

    public List<Integer> sortAsc(int[] ints) {
        List<Integer> numbers = new ArrayList<>();

        Arrays.stream(ints)
                .forEach((number) -> numbers.add(number));

        numbers.sort(Comparator.naturalOrder());

        return numbers;
    }

    public List<Integer> sortDsc(int[] ints) {
        List<Integer> numbers = new ArrayList<>();

        Arrays.stream(ints)
                .forEach((number) -> numbers.add(number));

        numbers.sort(Comparator.reverseOrder());

        return numbers;
    }

    public int multiplyByIndex(List<Integer> numbers1, List<Integer> numbers2, int index) {
        return numbers1.get(index) * numbers2.get(index);
    }

    private int sumMultiplies(List<Integer> numbers1, List<Integer> numbers2, int acc, int index) {
        if (index == numbers1.size()) {
            return acc;
        }

        return sumMultiplies(numbers1, numbers2, acc + multiplyByIndex(numbers1, numbers2, index), index + 1);
    }
}

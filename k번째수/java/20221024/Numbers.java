import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    private List<Integer> numbers;

    public Numbers(int[] number) {
        numbers = Arrays.stream(number)
                .boxed()
                .collect(Collectors.toList());
    }

    public Numbers getNumbers() {
        return new Numbers(numbers.stream()
                .mapToInt(Integer::intValue)
                .toArray());
    }

    public Integer get(int index) {
        return numbers.get(index);
    }

    public void add(Integer number) {
        numbers.add(number);
    }

    public Numbers sort() {
        int[] sorted = numbers.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();


        return new Numbers(sorted);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        Numbers otherNumbers = (Numbers) other;

        return numbers.equals(otherNumbers.numbers);
    }
}

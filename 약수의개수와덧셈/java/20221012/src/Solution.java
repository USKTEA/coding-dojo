import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int left, int right) {
        return sum(makeArray(left, right));
    }

    public List<Integer> makeArray(int left, int right) {
        List<Integer> numbers = new ArrayList<>();

        IntStream.range(left, right + 1).forEach(number -> numbers.add(number));

        return numbers;
    }

    public int sum(List<Integer> numbers) {
        return numbers.stream().map(number -> {
            if (countOdd(number) % 2 == 0) {
                return number;
            }

            return number * -1;
        }).reduce(0, (a, b) -> a + b);
    }

    private int countOdd(int a) {
        if (a == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i < Math.sqrt(a) + 1; i += 1) {
            if (i * i == a) {
                count += 1;

                continue;
            }

            if (a % i == 0) {
                count += 2;
            }
        }

        return count;
    }
}

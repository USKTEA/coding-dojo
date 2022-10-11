import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] d, int budget) {
        int[] sortedArray = sort(d);
        int[] sum = sum(sortedArray);

        return execution(budget, sortedArray);
    }

    public int[] sort(int[] ints) {
        return Arrays.stream(ints).sorted().toArray();
    }

    public int[] sum(int[] ints) {
        int[] sum = new int[ints.length];

        IntStream.range(0, sum.length).forEach(index -> {
            if (index == 0) {
                sum[index] = ints[index];

                return;
            }

            sum[index] = ints[index] + sum[index - 1];
        });

        return sum;
    }

    public int execution(int budget, int[] requirement) {
        return IntStream.range(0, requirement.length)
                .map(index -> {
                    if (requirement[index] <= budget) {
                        return 1;
                    }

                    return 0;
                }).sum();
    }
}

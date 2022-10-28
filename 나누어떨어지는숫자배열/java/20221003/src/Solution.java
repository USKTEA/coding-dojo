import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] array, int divisor) {
        IntStream intStream1 = sort(filter(array, divisor));
        IntStream intStream2 = IntStream.of(sort(filter(array, divisor)).toArray());

        if (intStream1.toArray().length == 0) {
            return new int[]{-1};
        }

        return intStream2.toArray();
    }

    public IntStream filter(int[] ints, int i) {
        IntStream intStream = IntStream.of(ints).filter((number) -> number % i == 0);
        return intStream;
    }

    public IntStream sort(IntStream intStream) {
        return intStream.sorted();
    }
}

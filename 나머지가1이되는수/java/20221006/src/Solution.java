import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        return minimum(dividerStream(n));
    }

    public IntStream dividerStream(int i) {
        return IntStream.range(1, i).filter(number -> i % number == 1);
    }

    public int minimum(IntStream intStream) {
        return intStream.findFirst().getAsInt();
    }
}

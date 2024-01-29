
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public boolean solution(int x) {
        int sum = sum(x);
        boolean answer = divide(x, sum);

        return answer;
    }

    public int sum(int x) {
        return Stream.of(Integer.toString(x).split(""))
                .map(a -> Integer.parseInt(a))
                .reduce(0, (a, b) -> a + b);
    }

    public boolean divide(int x, int sum) {
        return x % sum == 0 ? true : false;
    }
}

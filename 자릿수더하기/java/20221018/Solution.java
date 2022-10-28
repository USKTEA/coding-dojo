import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        return sum(toArray(n));
    }

    public String[] toArray(int number) {
        String stringNumber = Integer.toString(number);

        return stringNumber.split("");
    }

    public int sum(String[] strings) {
        return Arrays.stream(strings)
                .mapToInt(Integer::parseInt)
                .reduce(0, (a, b) -> a + b);
    }
}



import java.util.stream.IntStream;

public class Solution {
    int[] absolutes;
    private boolean[] signs;
    int index = 0;

    public int solution(int[] absolutes, boolean[] signs) {
        this.absolutes = absolutes;
        this.signs = signs;

        int answer = IntStream.of(absolutes)
                .map(number -> changeSign(number))
                .reduce(0, (a, b) -> a + b);

        return answer;
    }

    private int changeSign(int number) {
        if (signs[index] == false) {
            index += 1;

            return number * -1;
        }

        index += 1;
        return number;
    }
}

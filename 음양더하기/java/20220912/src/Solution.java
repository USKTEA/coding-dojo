import java.util.stream.IntStream;

public class Solution {
    int[] absolutes;
    private boolean[] signs;

    public int solution(int[] absolutes, boolean[] signs) {
        this.absolutes = absolutes;
        this.signs = signs;

        int answer = IntStream
                .iterate(0, i -> i + 1)
                .limit(absolutes.length)
                .map(index -> changeSign(index))
                .reduce(0, (a, b) -> a + b);

        return answer;
    }

    private int changeSign(int index) {
        if (signs[index] == false) {
            return absolutes[index] * -1;
        }

        return absolutes[index];
    }
}

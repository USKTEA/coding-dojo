import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int longest = longestLength(sizes);
        int lastLongest = lastLongLength(sizes);

        return calculateArea(longest, lastLongest);
    }

    public int longestLength(int[][] sizes) {
        int result = Arrays.stream(sizes)
                .map(card -> Math.max(card[0], card[1]))
                .reduce(0, (a, b) -> Math.max(a, b));

        return result;
    }

    public int lastLongLength(int[][] sizes) {
        int result = Arrays.stream(sizes)
                .map(card -> Math.min(card[0], card[1]))
                .reduce(0, (a, b) -> Math.max(a, b));

        return result;
    }

    public int calculateArea(int longest, int lastLongest) {
        return longest * lastLongest;
    }
}

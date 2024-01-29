import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = Arrays.stream(arr)
                .filter(number -> number != min)
                .toArray();

        return answer;
    }
}

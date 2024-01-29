import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] != arr[i -1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i += 1) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

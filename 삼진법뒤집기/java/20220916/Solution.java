import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        List<Integer> reversedTernary = ternary(n);
        int answer = decimal(reversedTernary);

        return answer;
    }

    public List<Integer> ternary(int number) {
        List<Integer> numbers = new ArrayList<>();

        int input = number;

        while (input >= 3) {
            numbers.add(input % 3);
            input /= 3;
        }

        numbers.add(input);

        return numbers;
    }

    public int decimal(List<Integer> ternary) {
        int answer = 0;
        int index = ternary.size() - 1;

        for (Integer number : ternary) {
            answer += Math.pow(3, index) * number;
            index -= 1;
        }

        return answer;
    }
}

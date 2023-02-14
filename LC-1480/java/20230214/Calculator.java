import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    private List<Integer> answer;
    private Integer previous;

    public Calculator() {
        answer = new ArrayList<>();
        previous = 0;
    }

    public int[] getAnswer(int[] ints) {
        Arrays.stream(ints).forEach((number) -> {
            answer.add(number + previous);

            previous += number;
        });

        return answer.stream()
                .mapToInt((number) -> number)
                .toArray();
    }
}

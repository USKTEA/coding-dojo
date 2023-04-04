import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(int[] numbers) {
        List<CustomNumber> customNumbers = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers.length; i += 1) {
            customNumbers.add(new CustomNumber(numbers[i]));
        }

        Collections.sort(customNumbers);

        for (int i = 0; i < customNumbers.size(); i += 1) {
            stringBuilder.append(customNumbers.get(i));
        }

        String answer = stringBuilder.toString();

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }
}

class CustomNumber implements Comparable {
    private String value;

    public CustomNumber(int value) {
        this.value = Integer.toString(value);
    }

    @Override
    public int compareTo(Object other) {
        CustomNumber otherCustomNumber = (CustomNumber) other;

        int thisFirst = Integer.parseInt(this.value + otherCustomNumber.value);
        int otherFirst = Integer.parseInt(otherCustomNumber.value + this.value);

        return otherFirst - thisFirst;
    }

    @Override
    public String toString() {
        return value;
    }
}
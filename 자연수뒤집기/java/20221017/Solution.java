import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(long n) {
        return toIntArray(reverse(toArray(string(n))));
    }

    public String string(long number) {
        return Long.toString(number);
    }

    public String[] toArray(String number) {
        return number.split("");
    }

    public String reverse(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(array).forEach(element -> stringBuilder.append(element));

        return stringBuilder.reverse().toString();
    }

    public int[] toIntArray(String s) {
        return Arrays.stream(s.split("")).map(number -> Integer.parseInt(number)).mapToInt(Integer::intValue).toArray();
    }
}

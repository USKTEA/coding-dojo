import java.util.Arrays;

public class Solution {

    public int[] toIntegers(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(string -> Integer.parseInt(string))
                .toArray();
    }

    public int[] sort(int[] ints) {
        return Arrays.stream(ints).sorted().toArray();
    }

    public String[] pickLowestAndHighest(int[] ints) {
        return new String[] {String.valueOf(ints[0])," ", String.valueOf(ints[ints.length - 1])};
    }

    public String toWord(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(strings).forEach(string -> stringBuilder.append(string));

        return stringBuilder.toString();
    }

    public String solution(String s) {
        return toWord(pickLowestAndHighest(sort(toIntegers(s))));
    }
}

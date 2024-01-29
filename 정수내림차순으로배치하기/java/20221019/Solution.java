import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public long solution(long n) {
        return toLong(sort(n));
    }
    public String sort(long i) {
        return Arrays.stream(Long.toString(i).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    public long toLong(String s) {
        return Long.parseLong(s);
    }
}



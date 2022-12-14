import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String s) {
        return toJaden(toStrings(s));
    }

    public String toJaden(String[] strings) {
        List<String> jadens = new ArrayList<>();

        IntStream.range(0, strings.length)
                .forEach((number) -> {
                    if (number == 0) {
                        jadens.add(strings[number].toUpperCase());

                        return;
                    }

                    if (number > 0 && jadens.get(number - 1).isBlank()) {
                        jadens.add(strings[number].toUpperCase());

                        return;
                    }

                    jadens.add(strings[number].toLowerCase());
                });

        return jadens.stream().collect(Collectors.joining(""));
    }

    public String[] toStrings(String s) {
        return s.split("");
    }
}

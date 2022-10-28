import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String[] solution(String[] strings, int n) {
        return primarySort(strings, n);
    }

    public String[] primarySort(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);

        Collections.sort(list, (o1, o2) -> {
            int result = o1.charAt(n) - o2.charAt(n);

            if (result == 0) {
                for (int i = 0; i < Math.min(o1.length(), o2.length()); i += 1) {
                    if (o1.charAt(i) == o2.charAt(i)) {
                        continue;
                    }

                    return o1.charAt(i) - o2.charAt(i);
                }
            }

            return result;
        });

        return Arrays.stream(list.toArray())
                .map(Object::toString)
                .toArray(String[]::new);
    }
}

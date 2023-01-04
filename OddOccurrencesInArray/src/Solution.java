
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int[] ints) {
        return findOdd(makeMap(ints));
    }

    public HashMap<Integer, Integer> makeMap(int[] ints) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : ints) {
            if (map.containsKey(number)) {
                map.replace(number, map.get(number) + 1);

                continue;
            }

            map.put(number, 1);
        }

        return map;
    }

    public int findOdd(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}

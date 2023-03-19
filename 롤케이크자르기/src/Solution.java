import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int solution(int[] toppings) {
        Map<Integer, Integer> right = rightPart(toppings);
        Set<Integer> left = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < toppings.length; i += 1) {
            int topping = toppings[i];

            left.add(topping);

            right.put(topping, right.get(topping) - 1);

            if (right.get(topping) == 0) {
                right.remove(topping);
            }

            if (left.size() == right.size()) {
                answer += 1;
            }
        }

        return answer;
    }

    public Map<Integer, Integer> rightPart(int[] toppings) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < toppings.length; i += 1) {
            int topping = toppings[i];

            counts.put(topping, counts.getOrDefault(topping, 0) + 1);
        }

        return counts;
    }
}

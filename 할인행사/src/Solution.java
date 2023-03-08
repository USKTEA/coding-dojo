import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    private static final int MEMBERSHIP_DAY = 10;

    public int solution(String[] wants, int[] numbers, String[] discounts) {
        Map<String, Integer> wishMap = generateWishMap(wants, numbers);
        List<Map<String, Integer>> cases = generateDiscountCases(discounts, MEMBERSHIP_DAY);

        return countSatisfiedCases(wishMap, cases);
    }

    public List<Map<String, Integer>> generateDiscountCases(String[] discounts, int length) {
        List<Map<String, Integer>> cases = new ArrayList<>();

        IntStream.range(0, discounts.length - length + 1)
                .mapToObj(i -> Arrays.stream(discounts, i, i + length).toList())
                .map(items -> {
                    Map<String, Integer> map = new HashMap<>();
                    items.forEach(item -> map.merge(item, 1, Integer::sum));

                    return map;
                }).forEach(cases::add);

        return cases;
    }

    public Map<String, Integer> generateWishMap(String[] wants, int[] numbers) {
        return IntStream.range(0, wants.length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> wants[i],
                        i -> numbers[i],
                        Integer::sum
                ));
    }

    public int countSatisfiedCases(Map<String, Integer> wishMap, List<Map<String, Integer>> cases) {
        return (int) cases.stream()
                .filter(discountMap -> wishMap.entrySet().stream()
                        .allMatch(entry -> discountMap.getOrDefault(entry.getKey(), 0) >= entry.getValue())
                ).count();
    }
}

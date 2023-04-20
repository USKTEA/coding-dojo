import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public String[] solution(String[] orders, int[] course) {
        Map<String, Integer> totalCombinations = new HashMap<>();

        for (int i = 0; i < course.length; i += 1) {
            HashMap<String, Integer> combinations = combinations(orders, course[i]);

            for (Map.Entry<String, Integer> entry : combinations.entrySet()) {
                String menus = entry.getKey();
                Integer count = entry.getValue();

                if (count < 2) {
                    continue;
                }
                totalCombinations.put(menus, totalCombinations.getOrDefault(menus, 0) + count);
            }
        }

        Map<Integer, List<String>> lengthCountMap = new HashMap<>();

        for (String key : totalCombinations.keySet()) {
            int length = key.length();
            List<String> list = lengthCountMap.getOrDefault(length, new ArrayList<>());
            list.add(key);
            lengthCountMap.put(length, list);
        }

        List<String> result = new ArrayList<>();

        for (int length : lengthCountMap.keySet()) {
            List<String> keys = lengthCountMap.get(length);
            keys.sort((key1, key2) -> totalCombinations.get(key2) - totalCombinations.get(key1));

            int maxCount = totalCombinations.get(keys.get(0));

            for (String key : keys) {
                int count = totalCombinations.get(key);

                if (count < maxCount) {
                    break;
                }

                result.add(key);
            }
        }

        String[] answer = result.toArray(new String[result.size()]);

        Arrays.sort(answer);

        return answer;
    }

    public HashMap<String, Integer> combinations(String[] orders, int dishes) {
        HashMap<String, Integer> combinations = new HashMap<>();

        for (int i = 0; i < orders.length; i += 1) {
            if (orders[i].length() < dishes) {
                continue;
            }

            List<String> possibles = possibles(orders[i], dishes, "", new ArrayList<>(), 0);

            for (int j = 0; j < possibles.size(); j += 1) {
                combinations.put(possibles.get(j), combinations.getOrDefault(possibles.get(j), 0) + 1);
            }
        }

        return combinations;
    }

    public List<String> possibles(String order, int dishes, String current, List<String> possibles, int index) {
        for (int i = index; i < order.length(); i += 1) {
            if (current.indexOf(order.charAt(i)) != -1) {
                continue;
            }

            String combination = current + order.charAt(i);

            if (combination.length() == dishes) {
                StringBuilder stringBuilder = new StringBuilder();
                List<String> sorted = Arrays.stream(combination.split("")).sorted().collect(Collectors.toList());

                for (int j = 0; j < sorted.size(); j += 1) {
                    stringBuilder.append(sorted.get(j));
                }

                if (possibles.contains(stringBuilder.toString())) {
                    continue;
                }

                possibles.add(stringBuilder.toString());
                continue;
            }

            possibles(order, dishes, combination, possibles, index + 1);
        }

        return possibles;
    }
}

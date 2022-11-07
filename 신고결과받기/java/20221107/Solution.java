import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, User> users = toUsers(id_list);

        reports(users, report);

        Map<User, Integer> reportResult = reportResult(users, new HashMap<>());

        Map<String, User> baned = getBanedUser(reportResult, k);

        users.values().forEach((user) -> user.getMailed(baned));

        List<Integer> mailCounts = new ArrayList<>();

        users.values().forEach((user) -> mailCounts.add(user.mailed()));

        return mailCounts.stream().mapToInt(Integer::intValue).toArray();
    }

    public Map<String, User> toUsers(String[] strings) {
        Map<String, User> users = new LinkedHashMap();

        Arrays.stream(strings).forEach((userId) -> {
            users.put(userId, User.of(userId));
        });

        return users;
    }

    public void reports(Map<String, User> users, String[] report) {
        Arrays.stream(report).forEach((history) -> {
            String userId = history.split(" ")[0];
            String reportId = history.split(" ")[1];

            users.get(userId).report(reportId);
        });
    }

    public Map<User, Integer> reportResult(Map<String, User> users, Map<User, Integer> reports) {
        users.values()
                .stream()
                .forEach((user) -> user.writeReport(reports));

        return reports;
    }

    public Map<String, User> getBanedUser(Map<User, Integer> reportResult, int k) {
        Map<String, User> baned = new HashMap<>();

        reportResult.forEach((user, count) -> {
            if (count >= k) {
                baned.put(user.id(), user);
            }
        });

        return baned;
    }
}

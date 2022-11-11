import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, User> users = toUsers(id_list);

        Map<User, Integer> reportResult = reports(users, report);

        Map<String, User> baned = getBanedUser(reportResult, k);

        Map<String, User> mailedUser = sendMail(users, baned);

        int[] mailedCount = countEmailsPerUser(mailedUser);

        return mailedCount;
    }

    private int[] countEmailsPerUser(Map<String,User> mailedUser) {
        List<Integer> mails = new ArrayList<>();

        mailedUser.values().forEach((user) -> {
            user.writeMailedCount(mails);
        });

        return mails.stream().mapToInt(Integer::intValue).toArray();
    }

    private Map<String,User> sendMail(Map<String,User> users, Map<String,User> baned) {
        Map<String, User> mailedUser = new LinkedHashMap<>(users);

        mailedUser.values().forEach((user) -> user.getMailed(baned));

        return mailedUser;
    }

    public Map<String, User> toUsers(String[] strings) {
        Map<String, User> users = new LinkedHashMap();

        Arrays.stream(strings).forEach((userId) -> {
            users.put(userId, User.of(userId));
        });

        return users;
    }

    public Map<User, Integer> reports(Map<String, User> users, String[] report) {
        Map<User, Integer> reportResult = new HashMap<>();

        Arrays.stream(report).forEach((history) -> {
            String userId = history.split(" ")[0];
            String reportId = history.split(" ")[1];

            users.get(userId).report(reportId);
        });

        users.values().stream().forEach((user) -> {
            user.writeReport(reportResult);
        });

        return reportResult;
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

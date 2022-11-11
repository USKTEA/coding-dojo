import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class User {
    private String id;
    private Set<User> reports = new HashSet();
    private List<User> banedByThisUser = new ArrayList<>();

    public User(String id) {
        this.id = id;
    }

    public static User of(String userId) {
        return new User(userId);
    }

    public String id() {
        return id;
    }

    public String toString() {
        return id;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        User otherUser = (User) other;

        return Objects.equals(id, otherUser.id);
    }

    public void report(String neo) {
        reports.add(new User(neo));
    }

    public int reportsSize() {
        return reports.size();
    }

    public Set reports() {
        return new HashSet(reports);
    }

    public void writeReport(Map<User, Integer> reportsResult) {
        reports.forEach((user) -> {
            if (reportsResult.containsKey(user)) {
                reportsResult.put(user, reportsResult.get(user) + 1);

                return;
            }

            reportsResult.put(user, 1);
        });
    }

    public int mailed() {
        return banedByThisUser.size();
    }

    public void getMailed(Map<String,User> baned) {
        reports.forEach((user) -> {
            if (baned.containsKey(user.id)) {
                banedByThisUser.add(user);
            }
        });
    }

    public List<Integer> writeMailedCount(List<Integer> mailed) {
        mailed.add(banedByThisUser.size());

        return mailed;
    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void toUser() {
        Solution solution = new Solution();
        User user = User.of("muzi");

        assertEquals(user.id(), "muzi");
    }

    @Test
    void equality() {
        assertEquals(new User("muzi"), new User("muzi"));
    }

    @Test
    void reports() {
        User user = new User("muzi");

        user.report("neo");

        assertEquals(user.reportsSize(), 1);
        assertEquals(user.reports().contains(new User("neo")), true);
    }

    @Test
    void writeReport() {
        Map<User, Integer> reportResult = new HashMap<>();

        User user = new User("muzi");
        user.report("neo");

        user.writeReport(reportResult);

        assertEquals(reportResult.size(), 1);
        assertTrue(reportResult.containsKey(new User("neo")));
    }

    @Test
    void getMailed() {
        Map<String, User> baned = new HashMap<>();
        baned.put("neo", new User("neo"));
        baned.put("apeach", new User("apeach"));

        User user = new User("muzi");
        user.report("neo");
        user.report("apeach");

        user.getMailed(baned);

        assertEquals(user.mailed(), 2);
    }

    @Test
    void writeMailedCount() {
        List<Integer> mailed = new ArrayList();

        Map<String, User> baned = new HashMap<>();
        baned.put("neo", new User("neo"));
        baned.put("apeach", new User("apeach"));

        User user = new User("muzi");
        user.report("neo");
        user.report("apeach");

        user.getMailed(baned);

        List<Integer> written = user.writeMailedCount(mailed);

        assertEquals(written.get(0), 2);
    }
}

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void users() {
        Solution solution = new Solution();
        Map users = solution.toUsers(new String[]{"muzi", "frodo", "apeach", "neo"});

        Map<String, User> expect = new LinkedHashMap();
        expect.put("muzi", new User("muzi"));
        expect.put("frodo", new User("frodo"));
        expect.put("apeach", new User("apeach"));
        expect.put("neo", new User("neo"));

        assertEquals(expect, users);
    }

    @Test
    void reports() {
        Solution solution = new Solution();

        Map<String, User> users = new LinkedHashMap();
        User muzi = new User("muzi");
        User frodo = new User("frodo");
        User apeach = new User("apeach");
        User neo = new User("neo");

        users.put("muzi", muzi);
        users.put("frodo", frodo);
        users.put("apeach", apeach);
        users.put("neo", neo);

        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        solution.reports(users, report);

        assertEquals(muzi.reportsSize(), 2);
        assertEquals(apeach.reportsSize(), 2);
        assertEquals(frodo.reportsSize(), 1);

        assertTrue(muzi.reports().contains(new User("frodo")));
        assertTrue(muzi.reports().contains(new User("neo")));
    }

    @Test
    void countReports() {
        Solution solution = new Solution();

        Map<String, User> users = new LinkedHashMap();
        User muzi = new User("muzi");
        User frodo = new User("frodo");
        User apeach = new User("apeach");
        User neo = new User("neo");

        users.put("muzi", muzi);
        users.put("frodo", frodo);
        users.put("apeach", apeach);
        users.put("neo", neo);

        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        solution.reports(users, report);

        Map<User, Integer> reports = new HashMap();

        Map<User, Integer> reportResult = solution.reportResult(users, reports);

        assertEquals(reportResult.get(frodo), 2);
        assertEquals(reportResult.get(muzi), 1);
    }

    @Test
    void getBanedUser() {
        Map<User, Integer> reportResult = new HashMap<>();

        reportResult.put(new User("frodo"), 2);
        reportResult.put(new User("neo"), 2);
        reportResult.put(new User("muzi"), 1);

        Solution solution = new Solution();

        Map<String, User> baned = solution.getBanedUser(reportResult, 2);

        assertEquals(baned.size(), 2);
        assertTrue(baned.containsKey("frodo"));
        assertTrue(baned.containsKey("neo"));
        assertFalse(baned.containsKey("muzi"));
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int[] answer = solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[] {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2);

        assertArrayEquals(new int[] {2,1,1,0}, answer);
    }
}

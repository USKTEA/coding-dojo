import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void setUpParticipantHashMap() {
        Solution solution = new Solution();
        Map<String, Integer> participantMap = solution.setUp(new String[] {"leo", "kiki", "eden"});

        assertEquals(Map.of(
                "leo", 1,
                "kiki", 1,
                "eden", 1
        ), participantMap);
    }

    @Test
    void removeParticipantHashMapKeyWithCompletion() {
        Solution solution = new Solution();
        Map<String, Integer> participants = new HashMap<>();
        participants.put("leo", 1);
        participants.put("kiki", 1);
        participants.put("eden", 1);

        Map<String, Integer> notCompleted = solution.removeCompletion(participants, new String[] {"eden", "kiki"});

        assertEquals(Map.of(
                "leo", 1
        ), notCompleted);
    }

    @Test
    void getNotCompletedParticipant() {
        Solution solution = new Solution();
        String participant = solution.getNotCompletedParticipant(Map.of("leo" , 1));

        assertEquals(participant, "leo");
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        String answer1 = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});

        assertEquals("leo", answer1);

        String answer2 = solution.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});

        assertEquals("vinko", answer2);
    }
}

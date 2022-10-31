import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void setUpParticipants() {
        Solution2 solution = new Solution2();
        List<Participant> participants = solution.setUp(new String[] {"leo", "kiki", "eden"});

        assertEquals(List.of(
                new Participant("leo"),
                new Participant("kiki"),
                new Participant("eden")
        ), participants);
    }

    @Test
    void setUpCompletion() {
        Solution2 solution = new Solution2();
        List<Participant> completions = solution.setUp(new String[] {"eden", "kiki"});

        assertEquals(List.of(
                new Participant("eden"),
                new Participant("kiki")
        ), completions);
    }

    @Test
    void remove() {
        Solution2 solution2 = new Solution2();
        List<Participant> participants = new ArrayList<>();
        participants.add(new Participant("leo"));
        participants.add(new Participant("kiki"));
        participants.add(new Participant("eden"));
        Participant notCompleted = solution2.getNotCompleted(participants, List.of(
                new Participant("eden"),
                new Participant("kiki")
                )
        );

        assertEquals("leo", notCompleted.getName());
    }

    @Test
    void solution() {
        Solution2 solution2 = new Solution2();
        String answer1 = solution2.solution(
                new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});

        assertEquals("leo", answer1);

        String answer2 = solution2.solution(
                new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});


        assertEquals("mislav", answer2);
    }
}

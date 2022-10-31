import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public List<Participant> setUp(String[] participantArray) {
        List<Participant> participants = new ArrayList<>();

        Arrays.stream(participantArray).forEach((participant) -> {
            participants.add(new Participant(participant));
        });

        return participants;
    }

    public Participant getNotCompleted(List<Participant> participants, List<Participant> completions) {
        completions.stream().forEach(completion -> participants.remove(participants.indexOf(completion)));

        return participants.get(0);
    }

    public String solution(String[] participant, String[] completion) {
        List<Participant> participants = setUp(participant);
        List<Participant> completions = setUp(completion);
        Participant notCompleted = getNotCompleted(participants, completions);

        return notCompleted.getName();
    }
}

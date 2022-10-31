import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public Map<String, Integer> setUp(String[] participantArray) {
        Map<String, Integer> participants = new HashMap<>();

        Arrays.stream(participantArray).forEach((participant) -> {
            if (participants.containsKey(participant)) {
                participants.put(participant, participants.get(participant) + 1);

                return;
            }

            participants.put(participant, 1);
        });

        return participants;
    }

    public Map<String, Integer> removeCompletion(Map<String, Integer> participants, String[] completions) {
        Arrays.stream(completions).forEach((completion) -> {
            if (participants.containsKey(completion)) {
                participants.put(completion, participants.get(completion) - 1);
            }

            if (participants.get(completion) == 0) {
                participants.remove(completion);
            }
        });

        return participants;
    }

    public String getNotCompletedParticipant(Map<String, Integer> participants) {
        return participants.keySet().stream().collect(Collectors.joining());
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participants = setUp(participant);
        Map<String, Integer> notCompleted = removeCompletion(participants, completion);

        return getNotCompletedParticipant(notCompleted);
    }
}

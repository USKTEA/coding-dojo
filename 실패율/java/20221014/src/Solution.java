import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int N, int[] stages) {
        List<Stage> stageList = sort(calculateFailedRate(totalChallengers(stages, currentChallengers(stages, stages(N)))));

        return Arrays.stream(stageList.stream().map(stage -> stage.stage()).toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();
    }

    public List<Stage> stages(int i) {
        List<Stage> stages = new ArrayList<>();

        IntStream.rangeClosed(1, i)
                .forEach(number -> stages.add(new Stage(number)));

        return stages;
    }

    public List<Stage> currentChallengers(int[] playerStatus, List<Stage> stages) {
        List<Stage> stagesCopy = new ArrayList<>(stages);

        Arrays.stream(playerStatus).forEach(number -> {
            stagesCopy.forEach(stage -> {
                if (stage.stage() - 1 == number) {
                    stage.addCurrentChallengers(stage.getCurrentChallengers() + 1);
                }
            });
        });

        return stagesCopy;
    }

    public List<Stage> totalChallengers(int[] ints, List<Stage> stages) {
        List<Stage> stagesCopy = new ArrayList<>(stages);

        Arrays.stream(ints).forEach(number -> {
            stagesCopy.forEach(stage -> {
                stage.addTotalChallengers(stage.getTotalChallengers() + 1);
            });
        });

        return stagesCopy;
    }

    public List<Stage> calculateFailedRate(List<Stage> stages) {
        List<Stage> stageCopy = new ArrayList<>(stages);
        
        stageCopy.forEach(stage -> stage.setFailedRate(
                (double) stage.getCurrentChallengers() / stage.getTotalChallengers()
        ));

        return stageCopy;
    }

    public List<Stage> sort(List<Stage> stages) {
        List<Stage> stageCopy = new ArrayList<>(stages);

        Collections.sort(stageCopy, (a, b) -> {
            int result = Double.compare(b.getFailedRate(), a.getFailedRate());

            return result;
        });

        return stageCopy;
    }
}

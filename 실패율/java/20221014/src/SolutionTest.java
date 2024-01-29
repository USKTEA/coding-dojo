import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void creation() {
        Solution solution = new Solution();
        List<Stage> stages = solution.stages(5);

        assertEquals(stages.size(), 5);
    }

    @Test
    void currentStageChallengers() {
        Solution solution = new Solution();
        List<Stage> stages = List.of(
                new Stage(1),
                new Stage(2),
                new Stage(3),
                new Stage(4),
                new Stage(5)
        );

        List<Stage> stagesAddChallengers = solution.currentChallengers(new int[]{4, 4, 4, 4, 4}, stages);

        assertAll(
                () -> assertEquals(stagesAddChallengers.get(0).getCurrentChallengers(), 0),
                () -> assertEquals(stagesAddChallengers.get(1).getCurrentChallengers(), 0),
                () -> assertEquals(stagesAddChallengers.get(2).getCurrentChallengers(), 0),
                () -> assertEquals(stagesAddChallengers.get(3).getCurrentChallengers(), 0),
                () -> assertEquals(stagesAddChallengers.get(4).getCurrentChallengers(), 5)
        );
    }

    @Test
    void totalChallengers() {
        Solution solution = new Solution();
        List<Stage> stages = List.of(
                new Stage(1),
                new Stage(2),
                new Stage(3),
                new Stage(4),
                new Stage(5)
        );

        List<Stage> stagesAddTotalChallengers = solution.totalChallengers(new int[]{4, 4, 4, 4, 4}, stages);

        assertAll(
                () -> assertEquals(stagesAddTotalChallengers.get(0).getTotalChallengers(), 5),
                () -> assertEquals(stagesAddTotalChallengers.get(1).getTotalChallengers(), 5),
                () -> assertEquals(stagesAddTotalChallengers.get(2).getTotalChallengers(), 5),
                () -> assertEquals(stagesAddTotalChallengers.get(3).getTotalChallengers(), 5),
                () -> assertEquals(stagesAddTotalChallengers.get(4).getTotalChallengers(), 5)
        );
    }

    @Test
    void calcFailedRate() {
        Solution solution = new Solution();
        List<Stage> stages = List.of(
                new Stage(1),
                new Stage(2),
                new Stage(3),
                new Stage(4),
                new Stage(5)
        );

        List<Stage> stagesHaveCurrentChallengers = solution.currentChallengers(new int[]{4, 4, 4, 4, 4}, stages);
        List<Stage> stagesHaveTotalChallengers = solution.totalChallengers(new int[]{4, 4, 4, 4, 4}, stagesHaveCurrentChallengers);

        List<Stage> stagesHaveFailedRate = solution.calculateFailedRate(stagesHaveTotalChallengers);

        assertAll(
                () -> assertEquals(stagesHaveFailedRate.get(0).getFailedRate(), 0),
                () -> assertEquals(stagesHaveFailedRate.get(1).getFailedRate(), 0),
                () -> assertEquals(stagesHaveFailedRate.get(2).getFailedRate(), 0),
                () -> assertEquals(stagesHaveFailedRate.get(3).getFailedRate(), 0),
                () -> assertEquals(stagesHaveFailedRate.get(4).getFailedRate(), 1)
        );
    }

    @Test
    void sort() {
        Solution solution = new Solution();
        List<Stage> stages = List.of(
                new Stage(1),
                new Stage(2),
                new Stage(3),
                new Stage(4)
        );

        List<Stage> stagesHaveCurrentChallengers = solution.currentChallengers(new int[]{4, 4, 4, 4, 4}, stages);

        List<Stage> stagesHaveTotalChallengers = solution.totalChallengers(new int[]{4, 4, 4, 4, 4}, stagesHaveCurrentChallengers);

        List<Stage> stagesHaveFailedRate = solution.calculateFailedRate(stagesHaveTotalChallengers);

        List<Stage> sortedStage = solution.sort(stagesHaveFailedRate);

        assertAll(
                () -> assertEquals(sortedStage.get(0), new Stage(4)),
                () -> assertEquals(sortedStage.get(1), new Stage(1)),
                () -> assertEquals(sortedStage.get(2), new Stage(2)),
                () -> assertEquals(sortedStage.get(3), new Stage(3))
        );
    }
}

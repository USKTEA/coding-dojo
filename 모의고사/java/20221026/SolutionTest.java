import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void entrants() {
        Solution solution = new Solution();
        List<Entrant> entrants = solution.entrants();

        assertEquals(new ArrayList<>(entrants), entrants);
    }

    @Test
    void makeRanking() {
        Solution solution = new Solution();
        List<Entrant> ranking = solution.ranking(new int[]{1, 2, 3, 4, 5});

        assertEquals(List.of(
                new Entrant(1, new int[]{1, 2, 3, 4, 5}),
                new Entrant(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                new Entrant(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5})
        ), ranking);
    }

    @Test
    void pickTheHighestScoreEntrant() {
        Solution solution = new Solution();
        int[] highestScoreId = solution.pickTheHighestScoreEntrantById(solution.ranking(new int[]{1, 2, 3, 4, 5}));

        assertArrayEquals(new int[]{1}, highestScoreId);
    }

    @Test
    void whenHaveSameScore() {
        Solution solution = new Solution();
        int[] highestScoreId = solution.pickTheHighestScoreEntrantById(solution.ranking(new int[]{1, 3, 2, 4, 2}));

        assertArrayEquals(new int[]{1, 2, 3}, highestScoreId);
    }
}

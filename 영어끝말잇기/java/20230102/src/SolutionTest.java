import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void setPlayers() {
        Solution solution = new Solution();
        String[] words = new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int participantsCount = 3;

        List<Player> players = solution.setPlayers(participantsCount, words);

        assertEquals(List.of(
                new Player(1, List.of("tank", "wheel", "mother")),
                new Player(2, List.of("kick", "land", "robot")),
                new Player(3, List.of("know", "dream", "tank"))
        ), players);
    }

    @Test
    void play() {
        Solution solution = new Solution();
        List<Player > players = List.of(
                new Player(1, List.of("tank", "wheel", "mother")),
                new Player(2, List.of("kick", "land", "robot")),
                new Player(3, List.of("know", "dream", "tank"))
        );

        int[] result = solution.play(players);

        assertArrayEquals(new int[]{3,3}, result);
    }

    @Test
    void check() {
        Solution solution = new Solution();

        boolean result = solution.check(List.of("tank", "kind"));

        assertTrue(result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        String[] words = new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage",
                "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        int[] answer = solution.solution(5, words);

        assertArrayEquals(new int[]{0, 0}, answer);

        String[] words2 = new String[] {"hello", "one", "even", "never", "now", "world", "draw"};

        int[] answer2 = solution.solution(2, words2);

        assertArrayEquals(new int[]{1, 3}, answer2);

        String[] words3 = new String[] {"qwe", "eqwe", "eqwe"};

        int[] answer3 = solution.solution(2, words3);

        assertArrayEquals(new int[]{1,2}, answer3);
    }
}

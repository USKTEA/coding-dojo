import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{100, 180, 360, 100, 270});

        assertEquals(4, result);
    }

    @Test
    void toPlayers() {
        Solution solution = new Solution();
        Queue<Integer> players = solution.toPlayers(new int[]{100, 180, 360, 100, 270});

        Stack<Integer> compare = new Stack<>();
        compare.push(100);
        compare.push(180);
        compare.push(360);
        compare.push(100);
        compare.push(270);

        assertEquals(compare ,players);
    }

}

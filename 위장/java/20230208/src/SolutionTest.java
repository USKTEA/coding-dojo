import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toCostume() {
        Solution solution = new Solution();
        Costume costume = solution.toCostume(new String[]{"yellow_hat", "headgear"});

        assertEquals(new Costume("yellow_hat", "headgear"), costume);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(
                new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}
        );

        assertEquals(5, answer);
    }
}

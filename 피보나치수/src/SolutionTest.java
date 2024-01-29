import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void fibonacci() {
        Solution solution = new Solution();

        Fibonacci fibonacci = solution.getFibonacci(2);

        assertEquals(1, fibonacci.number());
    }

    @Test
    void calculateLast() {
        Solution solution = new Solution();

        int last = solution.calculateLast(new Fibonacci(3));

        assertEquals(2, last);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int answer = solution.solution(5);

        assertEquals(5, answer);
    }
}

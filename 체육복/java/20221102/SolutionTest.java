import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void defaultStatus() {
        Solution solution = new Solution();
        List<Integer> status = solution.studentStatus(5);

        assertEquals(Arrays.asList(1, 1, 1, 1, 1), status);
    }

    @Test
    void reflectReserved() {
        Solution solution = new Solution();
        List<Integer> status = solution.reflectReserved(Arrays.asList(1, 1, 1, 1, 1), new int[]{1, 3, 5});

        assertEquals(Arrays.asList(2, 1, 2, 1, 2), status);
    }

    @Test
    void reflectLost() {
        Solution solution = new Solution();
        List<Integer> status = solution.reflectLost(Arrays.asList(2, 1, 2, 1, 2), new int[]{2, 4});

        assertEquals(Arrays.asList(2, 0, 2, 0, 2), status);
    }

    @Test
    void borrow() {
        Solution solution = new Solution();
        List<Integer> status = solution.borrow(Arrays.asList(2, 0, 2, 0, 2));

        assertEquals(Arrays.asList(1, 1, 1, 1, 2), status);
    }

    @Test
    void countNotZero() {
        Solution solution = new Solution();
        int numberOfStudentCanTakeLesson = solution.count(Arrays.asList(1, 1, 1, 1, 2));

        assertEquals(5, numberOfStudentCanTakeLesson);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer1 = solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        int answer2 = solution.solution(5, new int[]{2, 4}, new int[]{3});
        int answer3 = solution.solution(3, new int[]{3}, new int[]{1});
        int answer4 = solution.solution(5, new int[]{4, 2}, new int[]{3, 5});
        int answer5 = solution.solution(5, new int[]{1, 3}, new int[]{2, 4});

        assertEquals(5, answer1);
        assertEquals(4, answer2);
        assertEquals(2, answer3);
        assertEquals(5, answer4);
        assertEquals(5, answer5);
    }
}

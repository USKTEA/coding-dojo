import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toNSquareBoxes() {
        Solution solution = new Solution();

        List<Box> boxes = solution.toNSquareBoxes(3);

        assertEquals(List.of(
                new Box(0, 0), new Box(0, 1), new Box(0, 2),
                new Box(1, 0), new Box(1, 1), new Box(1, 2),
                new Box(2, 0), new Box(2, 1), new Box(2, 2)
        ), boxes);
    }

    @Test
    void slice() {
        Solution solution = new Solution();

        List<Box> boxes = Arrays.asList(
                new Box(0, 0), new Box(0, 1), new Box(0, 2),
                new Box(1, 0), new Box(1, 1), new Box(1, 2),
                new Box(2, 0), new Box(2, 1), new Box(2, 2)
        );
        int left = 2;
        int right = 5;

        List<Box> sliced = solution.slice(boxes, left, right);

        assertEquals(List.of(
                new Box(0, 2), new Box(1, 0), new Box(1, 1), new Box(1, 2)
        ), sliced);
    }

    @Test
    void toValueArray() {
        Solution solution = new Solution();
        int[] values = solution.toValueArray(List.of(
                new Box(0, 2), new Box(1, 0), new Box(1, 1), new Box(1, 2)
        ));

        assertArrayEquals(new int[]{3, 2, 2, 3}, values);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int[] answer = solution.solution(4, 7, 14);

        assertArrayEquals(new int[]{4, 3, 3, 3, 4, 4, 4, 4}, answer);
    }
}

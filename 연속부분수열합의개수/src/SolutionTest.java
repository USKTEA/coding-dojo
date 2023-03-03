import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toCircleSequence() {
        Solution solution = new Solution();
        int[] circleSequence = solution.toCircleSequence(new int[]{7, 9, 1, 1, 4});

        assertArrayEquals(new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1}, circleSequence);
    }

    @Test
    void sumOfSequenceOne() {
        Solution solution = new Solution();

        int elementsLength = 5;
        int sequence = 1;
        int[] circleSequence = new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1};

        Set<Integer> sequences = solution.sumOfSequence(sequence, elementsLength, circleSequence);

        assertEquals(Set.of(7, 9, 1, 4), sequences);
    }

    @Test
    void sumOfSequenceTwo() {
        Solution solution = new Solution();

        int elementsLength = 5;
        int sequence = 2;
        int[] circleSequence = new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1};

        Set<Integer> sequences = solution.sumOfSequence(sequence, elementsLength, circleSequence);

        assertEquals(Set.of(2, 5, 10, 11, 16), sequences);
    }

    @Test
    void sumOfSequenceThree() {
        Solution solution = new Solution();

        int elementsLength = 5;
        int sequence = 3;
        int[] circleSequence = new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1};

        Set<Integer> sequences = solution.sumOfSequence(sequence, elementsLength, circleSequence);

        assertEquals(Set.of(6, 11, 12, 17, 20), sequences);
    }

    @Test
    void sumOfSequenceFive() {
        Solution solution = new Solution();

        int elementsLength = 5;
        int sequence = 5;
        int[] circleSequence = new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1};

        Set<Integer> sequences = solution.sumOfSequence(sequence, elementsLength, circleSequence);

        assertEquals(Set.of(22), sequences);
    }

    @Test
    void setOfSequence() {
        Solution solution = new Solution();

        int elementsLength = 5;
        int[] circleSequence = new int[]{7, 9, 1, 1, 4, 7, 9, 1, 1};

        Set<Integer> sequences = solution.setOfSequence(elementsLength, circleSequence);

        assertEquals(Set.of(
                1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 20, 21, 22
        ), sequences);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int result = solution.solution(new int[]{7, 9, 1, 1, 4});

        assertEquals(18, result);
    }
}

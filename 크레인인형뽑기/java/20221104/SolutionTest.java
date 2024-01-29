import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private List<Stack> stacks;
    private List<Stack> reversedStacks;

    @BeforeEach
    void setUpStacks() {
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);

        Stack stack2 = new Stack();
        stack2.push(1);
        stack2.push(2);

        Stack stack3 = new Stack();
        stack3.push(1);
        stack3.push(2);

        stacks = Arrays.asList(
                stack1,
                stack2,
                stack3
        );

        Stack reversedStack1 = new Stack();
        reversedStack1.push(2);
        reversedStack1.push(1);

        Stack reversedStack2 = new Stack();
        reversedStack2.push(2);
        reversedStack2.push(1);

        Stack reversedStack3 = new Stack();
        reversedStack3.push(2);
        reversedStack3.push(1);

        reversedStacks = Arrays.asList(
                reversedStack1,
                reversedStack2,
                reversedStack3
        );
    }

    @Test
    void makeItOneDimension() {
        Solution solution = new Solution();

        List<Integer> oneDimension = solution.toOneDimension(new int[][]{{0, 0, 0}, {1, 1, 1}, {2, 2, 2}});

        assertEquals(Arrays.asList(0, 0, 0, 1, 1, 1, 2, 2, 2), oneDimension);
    }

    @Test
    void makeItYAxisStack() {
        Solution solution = new Solution();

        List<Stack> yAxisStack = solution.toYAxisArray(Arrays.asList(0, 0, 0, 1, 1, 1, 2, 2, 2), 3);

        assertEquals(
                stacks,
                yAxisStack
        );
    }

    @Test
    void makeStacksReverse() {
        Solution solution = new Solution();

        List<Stack> reversed = solution.reverse(stacks);

        assertEquals(Arrays.asList(
                Arrays.asList(2, 1),
                Arrays.asList(2, 1),
                Arrays.asList(2, 1)
        ), reversed);
    }

    @Test
    void picking() {
        Solution solution = new Solution();

        List<Stack> reversed = solution.reverse(solution.toYAxisArray(solution.toOneDimension(
                new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}
                }), 5));


        int result = solution.picking(reversed, new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        assertEquals(4, result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int result = solution.solution(
                new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        }, new int[]{1,5,3,5,1,2,1,4});

        assertEquals(4, result);

        int result2 = solution.solution(
                new int[][] {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                }, new int[] {1,2,3,4}
        );

        assertEquals(0, result2);
    }
}

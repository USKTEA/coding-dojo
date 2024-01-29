import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class Solution {
    public List<Integer> toOneDimension(int[][] ints) {
        List<Integer> numbers = new ArrayList<>();

        IntStream.range(0, ints.length)
                .forEach((y) ->
                        Arrays.stream(ints[y])
                                .forEach((x) -> numbers.add(x)));

        return new ArrayList<>(numbers);
    }

    public List<Stack> toYAxisArray(List<Integer> oneDimension, int borderLength) {
        List<Stack> yAxis = new ArrayList<>();

        IntStream.range(0, oneDimension.size() / borderLength)
                .forEach(number -> yAxis.add(new Stack()));

        IntStream.range(0, oneDimension.size())
                .forEach((index) -> {
                    if (oneDimension.get(index) == 0) {
                        return;
                    }

                    yAxis.get(index % borderLength).push(oneDimension.get(index));
                });

        return yAxis;
    }

    public List<Stack> reverse(List<Stack> stacks) {
        IntStream.range(0, stacks.size())
                .forEach((index) -> Collections.reverse(stacks.get(index)));

        return stacks;
    }

    public int picking(List<Stack> reversed, int[] moves) {
        Stack stack = new Stack();

        return Arrays.stream(moves).reduce(0, (acc, number) -> {
            if (reversed.get(number - 1).size() == 0) {
                return acc;
            }

            stack.push(reversed.get(number - 1).pop());

            if (stack.size() > 2) {
                if (stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {
                    stack.pop();
                    stack.pop();

                    return acc += 2;
                }
            }

            return acc;
        });
    }

    public int solution(int[][] board, int[] moves) {
        int borderLength = board.length;

        List<Integer> oneDimension = toOneDimension(board);

        List<Stack> stacks = toYAxisArray(oneDimension, borderLength);

        List<Stack> reversed = reverse(stacks);

        int result = picking(reversed, moves);

        return result;
    }
}

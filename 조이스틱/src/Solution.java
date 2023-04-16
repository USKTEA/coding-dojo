import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    private int move = 0;

    public int solution(String name) {
        int[] initialChars = initialChars(name.length());
        int[] nameChars = toChars(name);

        makeName(initialChars, nameChars, 0, 0);

        return move;
    }

    private void makeName(int[] initialChars, int[] nameChars, int index, int currentMove) {
        if (Arrays.equals(initialChars, nameChars)) {
            if (move == 0) {
                move = currentMove - 1;

                return;
            }

            if (move != 0) {
                move = Math.min(move, currentMove) - 1;

                return;
            }
        }

        if (index == -1) {
            index += nameChars.length;
        }

        int moves = minMoves(initialChars, nameChars, index);

        System.out.println(moves);

        makeName(initialChars, nameChars, index + 1, currentMove + moves + 1);
        makeName(initialChars, nameChars, index - 1, currentMove + moves + 1);
    }

    public int minMoves(int[] initialChars, int[] nameChars, int index) {
        return Math.min(nameChars[index] - initialChars[index], (int) 'Z' - nameChars[index] + 1);
    }

    public int[] toChars(String word) {
        return IntStream.range(0, word.length())
                .map((index) -> word.charAt(index))
                .toArray();
    }

    public int[] initialChars(int nameLength) {
        return IntStream.range(0, nameLength)
                .map((number) -> (int) 'A')
                .toArray();
    }
}

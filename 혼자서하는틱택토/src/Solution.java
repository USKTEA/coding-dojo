import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Solution {
    public int solution(String[] board) {
        int o = 0;
        int x = 0;

        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length(); j += 1) {
                if (Objects.equals(board[i].split("")[j], "O")) {
                    o += 1;
                }

                if (Objects.equals(board[i].split("")[j], "X")) {
                    x += 1;
                }
            }
        }

        if (o - x != 0 || o - x != 1) {
            return 0;
        }

        List<String> step = new ArrayList<>();

        IntStream.range(0, 3)
                .forEach((index) -> Arrays.stream(board[index].split(""))
                        .forEach(number -> step.add(number)));

        System.out.println(step.size());

        return 1;
    }
}

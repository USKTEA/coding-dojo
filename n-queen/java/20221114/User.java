import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class User {
    private final Board board;
    private final List<Queen> queens;

    public User(int n) {
        this.board = new Board(n);
        this.queens = setQueens(n);
    }

    private List<Queen> setQueens(int n) {
        return Arrays.stream(new int[n])
                .mapToObj((number) -> new Queen())
                .collect(Collectors.toList());
    }

    public int queens() {
        return queens.size();
    }

    public Board board() {
        return board;
    }

    public void put(int order, int boardSize) {
        Queen queen = getQueen(order);

        int [][] boardStatus = board.status();

        List<int[]> positions = new ArrayList<>();

        IntStream.range(0, boardStatus.length)
                        .forEach((y) -> IntStream.range(0, boardStatus[y].length)
                                .forEach((x) -> {
                                    if (boardStatus[y][x] == 0) {
                                        positions.add(new int[]{y, x});
                                    }
                                }));

        int [] position = positions.get(0);

        board.put(queen.setPosition(position[0], position[1]));
    }

    public Queen getQueen(int order) {
        return queens.get(order);
    }
}

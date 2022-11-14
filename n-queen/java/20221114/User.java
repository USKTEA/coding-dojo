import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class User {
    private Board board;
    private List<Queen> queens;

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

    public int put(int index, int order, int boardLength) {
        System.out.println(index);
        System.out.println(order);
        if (order == boardLength) {
            return 1;
        }

        Queen queen = getQueen(order);

        int[][] boardStatus = board.status();

        for (int i = 0; i < boardStatus.length; i +=1 ) {
            for (int j = 0; j < boardStatus[i].length; j += 1 ) {
                System.out.print(boardStatus[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        List<int[]> positions = new ArrayList<>();

        IntStream.range(order, boardStatus.length)
                .forEach((y) -> IntStream.range(index, boardStatus[y].length)
                        .forEach((x) -> {
                            if (positions.size() > 0) {
                                return;
                            }

                            if (boardStatus[y][x] == 0) {
                                positions.add(new int[]{y, x});
                                return;
                            }
                        }));


        if (positions.size() == 0) {
            this.board = new Board(4);
            this.queens = setQueens(4);

            return 0;
        }

        int[] position = positions.get(0);

        board.put(queen.setPosition(position[0], position[1]));

        return put(index, order + 1, boardLength);
    }

    public Queen getQueen(int order) {
        return queens.get(order);
    }

    public int findWaysToPutQueen() {
        int answer = 0;

        for (int i = 0; i < 4; i += 1) {
            for (int j = 0; j < 4; j += 1) {
                answer += put(i, j, 4);
            }
        }

        return answer;
    }
}

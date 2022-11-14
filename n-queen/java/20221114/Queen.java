import java.util.stream.IntStream;

public class Queen {
    private int[] position;

    public Queen setPosition(int y, int x) {
        this.position = new int[]{y, x};

        return this;
    }

    public int[][] drawAttackable(int[][] board) {
        IntStream.range(0, board.length)
                .forEach((y) -> IntStream.range(0, board[y].length)
                        .forEach((x) -> {
                    if (y == position[0] && x == position[1]) {
                        board[y][x] = 1;
                    }

                    if (y == position[0]) {
                        board[y][x] = 1;
                    }

                    if (x == position[1]) {
                        board[y][x] = 1;
                    }

                    if (x + y == position[0] + position[1]) {
                        board[y][x] = 1;
                    }

                    if (Math.abs(x - y) == Math.abs(position[0] - position[1])) {
                        board[y][x] = 1;
                    }
                }));

        return board;
    }

    public int[] position() {
        return position;
    }
}

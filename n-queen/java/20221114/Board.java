import java.util.ArrayList;
import java.util.List;

public class Board {
    private int[][] board;
    private List<Queen> queens = new ArrayList<>();

    public Board(int size) {
        this.board = new int[size][size];
    }

    public int[][] status() {
        return board;
    }

    @Override
    public boolean equals(Object other) {
        Board otherBoard = (Board) other;

        return board.length == otherBoard.board.length
                && board[0].length == otherBoard.board[0].length;
    }

    public void put(Queen queen) {
        queens.add(queen);

        this.board = queen.drawAttackable(board);
    }
}

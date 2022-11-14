import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void creation() {
        int n = 4;
        User user = new User(n);

        assertEquals(4, user.queens());
        assertEquals(new Board(n), user.board());
    }

    @Test
    void putQueen() {
        int borderLength = 4;
        int currentOrder = 0;

        User user = new User(borderLength);

        user.put(currentOrder, borderLength);

        int[][] board = new int[][] {{1, 1, 1, 1},{1, 1, 0, 0},{1, 0, 1, 0},{1, 0, 0, 1}};

        Queen queen = user.getQueen(currentOrder);
        assertArrayEquals(new int[]{0, 0}, queen.position());
        assertArrayEquals(board, user.board().status());
    }

    @Test
    void putQueenToNotAttackable() {
        int borderLength = 4;
        int currentOrder = 0;

        User user = new User(borderLength);

        user.put(currentOrder, borderLength);

        int[][] board1 = new int[][] {
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 1}};

        Queen queen1 = user.getQueen(currentOrder);
        assertArrayEquals(new int[]{0, 0}, queen1.position());
        assertArrayEquals(board1, user.board().status());

        int nextOrder = 1;

        int[][] board2 = new int[][] {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 1}
        };

        user.put(nextOrder, borderLength);

        Queen queen2 = user.getQueen(nextOrder);

        assertArrayEquals(new int[]{1, 2}, queen2.position());
        assertArrayEquals(board2, user.board().status());
    }
}

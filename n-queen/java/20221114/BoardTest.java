import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void creation() {
        int size = 4;
        Board board = new Board(size);

        int [][] currentBoard = board.status();

        assertArrayEquals(new int[size][size], currentBoard);
    }
}

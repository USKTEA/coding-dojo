import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void creation() {
        Queen queen = new Queen();
    }

    @Test
    void drawAttackable() {
        Queen queen = new Queen();
        queen.setPosition(0, 0);

        int [][] afterDrawn = queen.drawAttackable(new int[4][4]);

        assertArrayEquals(new int[][] {
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 1}
        }, afterDrawn);
    }
}

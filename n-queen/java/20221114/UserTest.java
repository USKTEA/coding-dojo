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
    void waysToPutQueens() {
        User user = new User(4);

        int ways =  user.findWaysToPutQueen();

        assertEquals(2, ways);
    }
}

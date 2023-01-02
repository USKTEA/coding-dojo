import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void creation() {
        Player player = new Player(1, List.of("ab", "cd"));

        assertNotNull(player);
    }

    @Test
    void equality() {
        Player player1 = new Player(1, List.of("ab", "cd"));
        Player player2 = new Player(1, List.of("ab", "cd"));

        assertEquals(player1, player2);
    }
}

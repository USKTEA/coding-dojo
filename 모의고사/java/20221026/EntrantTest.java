import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EntrantTest {

    @Test
    void creation() {
        Entrant entrant = new Entrant(1, new int[]{1, 2, 3});

        assertArrayEquals(new int[]{1, 2, 3}, entrant.answerPattern());
    }

    @Test
    void equality() {
        Entrant entrant1 = new Entrant(1, new int[]{1, 2, 3});
        Entrant entrant2 = new Entrant(1, new int[]{1, 3, 2});
        Entrant entrant3 = new Entrant(2, new int[]{1, 2, 3});

        assertEquals(entrant1, entrant2);
        assertNotEquals(entrant1, entrant3);
    }

    @Test
    void match() {
        Entrant entrant1 = new Entrant(1, new int[]{1, 2, 3, 4, 5});

        int[] answers = new int[]{1, 2, 3, 4, 5};

        entrant1.match(answers);

        int score1 = entrant1.score();

        assertEquals(5, score1);

        Entrant entrant2 = new Entrant(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5});

        entrant2.match(answers);

        int score2 = entrant2.score();

        assertEquals(0, score2);

        Entrant entrant3 = new Entrant(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        entrant3.match(answers);

        int score3 = entrant3.score();

        assertEquals(0, score3);
    }

    @Test
    void match2() {
        Entrant entrant1 = new Entrant(1, new int[]{1, 2, 3, 4, 5});

        int[] answers = new int[]{1,3,2,4,2};

        entrant1.match(answers);

        int score1 = entrant1.score();

        assertEquals(2, score1);
    }
}

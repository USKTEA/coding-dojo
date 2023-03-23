import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntSequenceTest {
    @Test
    void next() {
        IntSequence intSequence = new IntSequence(5);

        assertEquals(1, intSequence.checkNext());

        intSequence.next();

        assertEquals(2, intSequence.checkNext());
    }
}

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PopperTest {

    @Test
    void add() {
        Popper popper = new Popper();

        popper.add("a");

        assertEquals(List.of("a"), popper.list());
    }

    @Test
    void addPair() {
        Popper popper = new Popper();

        popper.add("a");
        popper.add("a");

        assertEquals(List.of(), popper.list());
    }

    @Test
    void removePairs() {
        Popper popper = new Popper();

        int popperSize = popper.removePair(new String[] {"b", "a", "a", "b", "a", "a"});

        assertEquals(0, popperSize);

        int popperSize1 = popper.removePair(new String[] {"c","d","c","d"});

        assertEquals(4, popperSize1);
    }

}

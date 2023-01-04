import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JacquardTest {

    @Test
    void toMultiset() {
        Jacquard jacquard = new Jacquard();

        List<String> sets1 = jacquard.toMultiset("FRANCE");

        assertEquals(List.of("fr", "ra", "an", "nc", "ce"), sets1);

        List<String> sets2 = jacquard.toMultiset("aa1+aa2");

        assertEquals(List.of("aa", "aa"), sets2);

        List<String> sets3 = jacquard.toMultiset("AAAA12");

        assertEquals(List.of("aa", "aa", "aa"), sets3);

        List<String> sets4 = jacquard.toMultiset("aa1+aa2");

        assertEquals(List.of("aa", "aa"), sets4);
    }
}

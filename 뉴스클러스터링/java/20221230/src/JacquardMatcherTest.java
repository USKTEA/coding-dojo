import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JacquardMatcherTest {

    @Test
    void match() {
        JacquardMatcher jacquardMatcher = new JacquardMatcher(65536);

        Jacquard jacquard1 = Jacquard.of("FRANCE");
        Jacquard jacquard2 = Jacquard.of("french");

        float result = jacquardMatcher.match(jacquard1, jacquard2);

        assertEquals(result, 16384);
    }
}

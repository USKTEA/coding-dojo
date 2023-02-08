import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpyTest {
    @Test
    void variations() {
        List<Costume> costumes = List.of(
                new Costume("yellow_hat", "headgear"),
                new Costume("blue_sunglasses", "eyewear"),
                new Costume("green_turban", "headgear")
        );

        Spy spy = Spy.of(costumes);

        int variations = spy.variations();

        assertEquals(5, variations);
    }
}

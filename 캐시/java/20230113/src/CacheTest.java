import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheTest {

    @Test
    void match() {
        Cache cache = new Cache(1);

        boolean result = cache.match("Jeju");

        assertFalse(result);
    }
}

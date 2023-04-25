import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FileTest {
    @Test
    void compareName() {
        File fileA = new File("a", "1", ".jpg");
        File fileB = new File("b", "2", ".jpg");

        assertEquals(-1, fileA.compareTo(fileB));
    }

    @Test
    void compareNumber() {
        File fileA = new File("img", "1", ".jpg");
        File fileB = new File("img", "10", ".jpg");

        assertTrue(fileA.compareTo(fileB) < 0);
    }

    @Test
    void compareOtherNumber() {
        File fileA = new File("IMG", "01", ".GIF");
        File fileB = new File("img", "02", ".png");

        assertTrue(fileA.compareTo(fileB) < 0);
    }
}

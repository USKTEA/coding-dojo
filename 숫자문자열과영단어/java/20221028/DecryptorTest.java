import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DecryptorTest {

    @Test
    void creation() {
        Decryptor decryptor = new Decryptor();

        assertNotNull(decryptor);
    }

    @Test
    void decryptionTable() {
        Decryptor decryptor = new Decryptor();
        Map table = decryptor.getDecryptionTable();

        Map<String, String> expectedTable = Map.ofEntries(
                Map.entry("one", "1"),
                Map.entry("two", "2"),
                Map.entry("three", "3"),
                Map.entry("four", "4"),
                Map.entry("five", "5"),
                Map.entry("six", "6"),
                Map.entry("seven", "7"),
                Map.entry("eight", "8"),
                Map.entry("nine", "9"),
                Map.entry("zero", "0"),
                Map.entry("0", "0"),
                Map.entry("1", "1"),
                Map.entry("2", "2"),
                Map.entry("3", "3"),
                Map.entry("4", "4"),
                Map.entry("5", "5"),
                Map.entry("6", "6"),
                Map.entry("7", "7"),
                Map.entry("8", "8"),
                Map.entry("9", "9")
        );

        assertEquals(expectedTable, table);
    }

    @Test
    void decryptNumber() {
        Decryptor decryptor = new Decryptor();
        decryptor.decrypt("1");

        int result = decryptor.result();

        assertEquals(1, result);
    }

    @Test
    void decryptStringNumber() {
        Decryptor decryptor = new Decryptor();
        decryptor.decrypt("one");

        int result = decryptor.result();

        assertEquals(1, result);
    }

    @Test
    void decryptStringArray() {
        Decryptor decryptor = new Decryptor();

        String[] stringNumber = new String[]{"o", "n", "e"};

        Arrays.stream(stringNumber).forEach((word) -> decryptor.decrypt(word));

        int result = decryptor.result();

        assertEquals(1, result);
    }

    @Test
    void decryptStringArrayAndNumber() {
        Decryptor decryptor = new Decryptor();

        String[] stringNumber = new String[]{"o", "n", "e", "1"};

        Arrays.stream(stringNumber).forEach((word) -> decryptor.decrypt(word));

        int result = decryptor.result();

        assertEquals(11, result);
    }
}

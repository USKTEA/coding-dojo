import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileNameParserTest {
    @Test
    void parseEasyName() {
        FileNameParser fileNameParser = new FileNameParser();

        List<String> parsed = fileNameParser.parse("img1.png");

        assertEquals(List.of("img", "1", ".png"), parsed);
    }

    @Test
    void parseDifficultName() {
        FileNameParser fileNameParser = new FileNameParser();

        List<String> parsed = fileNameParser.parse("foo010bar020.zip");

        assertEquals(List.of("foo", "010", "bar020.zip"),parsed);
    }

    @Test
    void parseHead() {
        FileNameParser fileNameParser = new FileNameParser();
        String head = fileNameParser.parseHead("img1.png");

        assertEquals("img", head);
    }

    @Test
    void parseNumber() {
        FileNameParser fileNameParser = new FileNameParser();
        String number = fileNameParser.parseNumber("1.png");

        assertEquals("1", number);
    }

    @Test
    void parseWithoutTail() {
        FileNameParser fileNameParser = new FileNameParser();
        List<String> parsed = fileNameParser.parse("abc123");

        assertEquals(List.of("abc", "123", ""),parsed);
    }
}

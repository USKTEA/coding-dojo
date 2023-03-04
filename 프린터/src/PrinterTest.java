import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrinterTest {
    @Test
    void print() {
        Printer printer = new Printer();

        List<Document> documents = new ArrayList<>();

        documents.addAll(Arrays.asList(
                        new Document(0, 2),
                        new Document(1, 1),
                        new Document(2, 3),
                        new Document(3, 2))
        );

        List<Document> printed = printer.print(documents);

        assertEquals(List.of(
                new Document(2, 3),
                new Document(3, 2),
                new Document(0, 2),
                new Document(1, 1)
        ), printed);
    }
}

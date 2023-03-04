import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void toDocuments() {
        Solution solution = new Solution();
        int[] properties = new int[]{2, 1, 3, 2};

        List<Document> documents = solution.toDocuments(properties);

        assertEquals(Arrays.asList(
                new Document(0, 2),
                new Document(1, 1),
                new Document(2, 3),
                new Document(3, 2)
        ), documents);
    }

    @Test
    void print() {
        Solution solution = new Solution();

        List<Document> documents = new ArrayList<>();

        documents.addAll(
                Arrays.asList(
                        new Document(0, 2),
                        new Document(1, 1),
                        new Document(2, 3),
                        new Document(3, 2)
                ));

        List<Document> printed = solution.print(documents);

        assertEquals(List.of(
                new Document(2, 3),
                new Document(3, 2),
                new Document(0, 2),
                new Document(1, 1)
        ), printed);
    }

    @Test
    void findIndexOf() {
        Solution solution = new Solution();
        int location = 2;

        int answer = solution.indexOf(List.of(
                new Document(2, 3),
                new Document(3, 2),
                new Document(0, 2),
                new Document(1, 1)
        ), location);

        assertEquals(1, answer);
    }

    @Test
    void solution() {
        Solution solution = new Solution();
        int answer = solution.solution(new int[]{2, 1, 3, 2}, 2);

        assertEquals(1, answer);
    }
}

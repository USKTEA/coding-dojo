import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassifierTest {
    @Test
    void classify() {
        Classifier classifier = new Classifier();

        List<Tangerine> tangerines = classifier.classify(new int[]{1, 3, 2, 5, 4, 5, 2, 3});

        assertEquals(List.of(
                new Tangerine(1, 1),
                new Tangerine(2, 2),
                new Tangerine(3, 2),
                new Tangerine(4, 1),
                new Tangerine(5, 2)
        ), tangerines);
    }

    @Test
    void sortByCountDsc() {
        Classifier classifier = new Classifier();

        List<Tangerine> tangerines = classifier.sortByCountDsc(List.of(
                new Tangerine(1, 1),
                new Tangerine(2, 2),
                new Tangerine(3, 2),
                new Tangerine(4, 1),
                new Tangerine(5, 2)
        ));

        assertEquals(tangerines.get(0).counts(), 2);
    }

    @Test
    void box() {
        Classifier classifier = new Classifier();

        List<Tangerine> boxed = classifier.box(5, List.of(
                new Tangerine(5, 2),
                new Tangerine(3, 2),
                new Tangerine(2, 2),
                new Tangerine(1, 1),
                new Tangerine(4, 1)
        ));

        assertEquals(boxed.size(), 3);
    }
}

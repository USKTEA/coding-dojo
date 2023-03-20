import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomTreeTest {
    @Test
    void creation() {
        CustomTree customTree = CustomTree.of(new int[][]{{1, 2}, {2, 3}, {3, 4}});

        assertEquals(4, customTree.size());
    }

    @Test
    void getMinimumDifference() {
        CustomTree customTree = CustomTree.of(new int[][]{{1, 2}, {2, 3}, {3, 4}});

        int difference = customTree.getMinimumDifference();

        assertEquals(0, difference);
    }
}

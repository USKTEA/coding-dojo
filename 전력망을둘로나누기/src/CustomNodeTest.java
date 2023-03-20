import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomNodeTest {
    @Test
    void creation() {
        CustomNode customNode = new CustomNode(1);

        assertEquals(1, customNode.number());
    }

    @Test
    void addChild() {
        CustomNode customNode = new CustomNode(1);

        assertEquals(Map.of(), customNode.children());

        customNode.addChild(2);

        assertEquals(Map.of(2, new CustomNode(2)), customNode.children());
    }

    @Test
    void whenTryToGetNotExistChild() {
        CustomNode customNode = new CustomNode(1);
        CustomNode child = customNode.get(2);

        assertNull(child);
    }

    @Test
    void getChildSuccess() {
        CustomNode customNode = new CustomNode(1);
        customNode.addChild(2);

        CustomNode child = customNode.get(2);

        assertEquals(new CustomNode(2), child);
    }

    @Test
    void totalChildren() {
        CustomNode customNode = new CustomNode(1);
        customNode.addChild(2);
        customNode.addChild(3);
        customNode.get(3).addChild(4);

        int count = customNode.totalChildren();

        assertEquals(3, count);
    }
}

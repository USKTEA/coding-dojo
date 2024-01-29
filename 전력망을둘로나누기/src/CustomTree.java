import java.util.Map;
import java.util.Objects;

public class CustomTree {
    private CustomNode node;
    private int size;

    public CustomTree(int[][] wires) {
        setNode(wires);
    }

    public static CustomTree of(int[][] wires) {
        return new CustomTree(wires);
    }

    private void setNode(int[][] wires) {
        node = new CustomNode(wires[0][0]);
        node.addChild(wires[0][1]);

        size += 2;

        for (int i = 1; i < wires.length; i += 1) {
            System.out.println(wires[i][0]);
            if (Objects.nonNull(node.get(wires[i][0]))) {
                node.get(wires[i][0]).addChild(wires[i][1]);

                size += 1;

                continue;
            }

            if (Objects.nonNull(node.get(wires[i][1]))) {
                node.get(wires[i][1]).addChild(wires[i][0]);

                size += 1;
            }
        }
    }

    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        CustomTree that = (CustomTree) object;

        return size == that.size && Objects.equals(node, that.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, size);
    }

    public int getMinimumDifference() {
        int answer = size;
        int left;
        int right;

        CustomNode current = node;
        Map<Integer, CustomNode> children;

        while (current.hasChildren()) {
            children = current.children();

            for (Map.Entry<Integer, CustomNode> entry : children.entrySet()) {
                current = entry.getValue();

                left = size - (current.totalChildren() + 1);
                right = current.totalChildren() + 1;

                answer = Math.min(answer, Math.abs(left - right));
            }

        }

        return answer;
    }
}

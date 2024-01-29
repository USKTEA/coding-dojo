import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomNode {
    private int number;
    private Map<Integer, CustomNode> children;

    public CustomNode(int number) {
        this.number = number;
        children = new HashMap<>();
    }

    public void addChild(int number) {
        this.children.put(number, new CustomNode(number));
    }

    public int number() {
        return number;
    }

    public Map<Integer, CustomNode> children() {
        return children;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        CustomNode that = (CustomNode) object;

        return number == that.number && Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, children);
    }

    public CustomNode get(int number) {
        if (Objects.nonNull(children.get(number))) {
            return children.get(number);
        }

        for (Map.Entry<Integer, CustomNode> entry : children.entrySet()) {
            CustomNode node = entry.getValue();

            if (node.hasChildren()) {
                CustomNode result = node.get(number);

                if (Objects.nonNull(result)) {
                    return result;
                }
            }
        }

        return null;
    }

    public boolean hasChildren() {
        return children.size() > 0 ? true : false;
    }

    public int totalChildren() {
        int count = 0;

        if (children.size() == 0) {
            return count;
        }

        count += children.size();

        for (Map.Entry<Integer, CustomNode> entry : children.entrySet()) {
            if (entry.getValue().hasChildren()) {
                count += entry.getValue().totalChildren();
            }
        }

        return count;
    }
}

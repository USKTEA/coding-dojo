import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Popper {
    ArrayDeque<String> deque = new ArrayDeque<>();

    public void add(String string) {
        if (deque.size() > 0 && Objects.equals(deque.getLast(), string)) {
            deque.removeLast();

            return;
        }

        deque.add(string);
    }

    public List<String> list() {
        return deque.stream().collect(Collectors.toList());
    }

    public int removePair(String[] strings) {
        Arrays.stream(strings).forEach((string) -> add(string));

        return deque.size();
    }
}

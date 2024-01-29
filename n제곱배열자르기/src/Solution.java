import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n, long left, long right) {
        return toValueArray(slice(toNSquareBoxes(n), left, right));
    }

    public List<Box> toNSquareBoxes(int n) {
        List<Box> boxes = new ArrayList<>();

        IntStream.range(0, n)
                .forEach((x) -> IntStream.range(0, n).
                        forEach((y) -> {
                            boxes.add(new Box(x, y));
                        }));
        return boxes;
    }

    public List<Box> slice(List<Box> boxes, long left, long right) {
        return boxes.subList(Long.valueOf(left).intValue(), Long.valueOf(right).intValue() + 1);
    }

    public int[] toValueArray(List<Box> boxes) {
        return boxes.stream()
                .map(Box::value)
                .mapToInt((value) -> value)
                .toArray();
    }
}

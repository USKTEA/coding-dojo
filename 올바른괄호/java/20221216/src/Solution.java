import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public List<List<Integer>> parenthesisIndices(String s) {
        List<Integer> opens = new ArrayList<>();
        List<Integer> closes = new ArrayList<>();

        IntStream.range(0, s.length()).forEach((index) -> {
            if (s.charAt(index) == '(') {
                opens.add(index);
            }

            if (s.charAt(index) == ')') {
                closes.add(index);
            }
        });

        return List.of(
                opens,
                closes
        );
    }

    public boolean isValidParenthesis(String s) {
        List<List<Integer>> parenthesisIndices = parenthesisIndices(s);

        List<Integer> openIndices = parenthesisIndices.get(0);
        List<Integer> closeIndices = parenthesisIndices.get(1);

        if (openIndices.size() != closeIndices.size()) {
            return false;
        }

        for (int i = 0; i < openIndices.size(); i += 1) {
            if (openIndices.get(i) > closeIndices.get(i)) {
                return false;
            }
        }

        return true;
    }
}

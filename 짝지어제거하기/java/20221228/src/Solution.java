import java.util.ArrayDeque;

public class Solution {
    public String[] toArray(String word) {
        return word.split("");
    }

    public int removePairs(String[] strings) {
        Popper popper = new Popper();

        return popper.removePair(strings);
    }

    public int checkResult(int dequeLength) {
        if (dequeLength == 0) {
            return 1;
        }

        return 0;
    }

    public int solution(String s) {
        return checkResult(removePairs(toArray(s)));
    }
}

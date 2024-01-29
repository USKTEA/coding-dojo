import java.util.HashSet;
import java.util.Set;

public class Seesaw {
    private final int[] meters;

    public Seesaw(int[] meters) {
        this.meters = meters;
    }

    public boolean isBalanced(int left, int right) {
        if (left == right) {
            return true;
        }

        Set<Integer> possibles = new HashSet<>();

        for (int i = 0; i < meters.length; i += 1) {
            possibles.add(left * meters[i]);
        }

        for (int i = 0; i < meters.length; i += 1) {
            if (possibles.contains(right * meters[i])) {
                return true;
            }
        }

        return false;
    }
}

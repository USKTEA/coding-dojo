import java.util.ArrayList;
import java.util.List;

public class Jacquard {
    List<String> sets;

    public Jacquard(String word) {
        this.sets = toMultiset(word);
    }

    public Jacquard() {
    }

    public static Jacquard of(String word) {
        return new Jacquard(word);
    }

    public List<String> toMultiset(String word) {
        List<String> sets = new ArrayList<>();

        char[] chars = word.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i += 1) {
            if (i + 1 >= chars.length) {
                break;
            }

            if ((chars[i] >= 'a' && chars[i] <= 'z')
                    && chars[i + 1] >= 'a' && chars[i + 1] <= 'z') {
                sets.add((chars[i]) + Character.toString(chars[i + 1]));
            }
        }

        return sets;
    }

    public List<String> sets() {
        return sets;
    }
}

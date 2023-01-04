import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class JacquardMatcher {
    int CRITERION;

    public JacquardMatcher(int criterion) {
        this.CRITERION = criterion;
    }

    public int match(Jacquard jacquard1, Jacquard jacquard2) {
        List<String> sets1 = jacquard1.sets();
        List<String> sets2 = jacquard2.sets();

        int union = getUnion(sets1, sets2);
        int intersection = getIntersection(sets1, sets2);


        sets1.stream().forEach((set) -> System.out.println(set));
        sets2.stream().forEach((set) -> System.out.println(set));

        return (int) ((double) intersection / union * CRITERION);
    }

    private int getIntersection(List<String> sets1, List<String> sets2) {
        int intersection = 0;

        HashMap<Integer, String> checked = new HashMap<>();

        for (int i = 0; i < sets1.size(); i += 1) {
            if (Objects.equals(sets1.get(i), sets2.get(i))) {
                String a = checked.get(i);

                if (sets2.get(i) == a) {
                    continue;
                }

                intersection += 1;

                checked.put(i, sets2.get(i));

                continue;
            }
        }

        return intersection;
    }

    private int getUnion(List<String> sets1, List<String> sets2) {
        List<String> union = new ArrayList<>();

        sets1.stream().forEach((set) -> {
            if (numberOfElement(set, sets1) > numberOfElement(set, union)) {
                union.add(set);
            }
        });

        sets2.stream().forEach((set) -> {
            if (numberOfElement(set, sets2) > numberOfElement(set, union)) {
                union.add(set);
            }
        });

        return union.size();
    }

    private int numberOfElement(String element, List<String> list) {
        int count = 0;

        for (int i = 0; i < list.size(); i += 1) {
            if (Objects.equals(element, list.get(i))) {
                count += 1;
            }
        }

        return count;
    }
}

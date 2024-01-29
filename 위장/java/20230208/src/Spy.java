import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Spy {
    private Map<String, ArrayList<Costume>> costumes;

    public Spy(Map<String, ArrayList<Costume>> costumes) {
        this.costumes = costumes;
    }

    public static Spy of(List<Costume> items) {
        Map<String, ArrayList<Costume>> costumes = new HashMap<>();

        items.stream()
                .forEach((item) -> {
                    if (costumes.containsKey(item.part())) {
                        ArrayList<Costume> i = costumes.get(item.part());
                        i.add(item);

                        costumes.put(item.part(), i);

                        return;
                    }

                    ArrayList<Costume> newList = new ArrayList<>();

                    newList.add(item);

                    costumes.put(item.part(), newList);
                });

        return new Spy(costumes);
    }

    public int variations() {
        List<Integer> counts = new ArrayList<>();

        costumes.values().stream().forEach(item -> counts.add(item.size() + 1));

        int count = IntStream.range(0, counts.size())
                .reduce(1, (acc, a) -> acc * counts.get(a));

        return count - 1;
    }
}

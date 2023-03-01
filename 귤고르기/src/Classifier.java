import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classifier {
    public List<Tangerine> classify(int[] tangerines) {
        Map<Integer, Integer> classified = new HashMap<>();
        List<Tangerine> tangerineList = new ArrayList<>();

        Arrays.stream(tangerines)
                .forEach((tangerine) -> {
                    if (classified.containsKey(tangerine)) {
                        classified.put(tangerine, classified.get(tangerine) + 1);

                        return;
                    }

                    classified.put(tangerine, 1);
                });


        classified.forEach((key, value) -> {
            tangerineList.add(new Tangerine(key, value));
        });

        return tangerineList;
    }

    public List<Tangerine> sortByCountDsc(List<Tangerine> tangerines) {
        List<Tangerine> copied = new ArrayList<>(tangerines);

        copied.sort((a, b) -> {
            if (b.counts() == a.counts()) {
                return b.size() - a.size();
            }

            return b.counts() - a.counts();
        });

        return copied;
    }

    public List<Tangerine> box(int toBox, List<Tangerine> tangerines) {
        List<Tangerine> boxed = new ArrayList<>();

        int index = 0;
        int counts = 0;

        while (counts < toBox) {
            boxed.add(tangerines.get(index));

            counts = boxed.stream()
                    .map(tangerine -> tangerine.counts())
                    .reduce(0, (a, b) -> a + b);

            index += 1;
        }

        return boxed;
    }
}

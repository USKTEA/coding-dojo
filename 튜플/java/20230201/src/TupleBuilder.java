import java.util.ArrayList;
import java.util.List;

public class TupleBuilder {
    public static int[] build(List<List<String>> list) {
        List<Integer> tuple = new ArrayList<>();

        list.forEach(element -> {
            if (tuple.isEmpty()) {
                tuple.add(Integer.parseInt(element.get(0)));

                return;
            }

            element.forEach((number) -> {
                if (!tuple.contains(Integer.parseInt(number)))
                    tuple.add(Integer.parseInt(number));
            });
        });

        return tuple.stream().mapToInt(Integer::intValue).toArray();
    }
}

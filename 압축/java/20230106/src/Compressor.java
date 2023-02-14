import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class Compressor {
    private Map<String, Integer> index = new HashMap<>();
    private List<String> dictionary;
    private List<Integer> stream = new ArrayList<>();

    public Compressor() {
        this.dictionary = new ArrayList<>(Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")));
        IntStream.range(0, dictionary.size())
                .forEach((number) -> index.put(dictionary.get(number), number + 1));
    }

    public int[] zip(String msg) {
        if (msg.isEmpty()) {
            return stream.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        for (int i = 0; i < dictionary.size(); i += 1) {
            String word = dictionary.get(i);

            if (word.length() > msg.length()) {
                continue;
            }

            if (Objects.equals(word, msg.substring(0, word.length()))) {
                stream.add(index.get(word));

                String remain = msg.substring(msg.substring(0, word.length()).length());

                if (!remain.isEmpty()) {
                    String newWord = word + remain.charAt(0);

                    dictionary.add(0, newWord);
                    index.put(newWord, index.size() + 1);
                }

                return zip(msg.substring(word.length()));
            }
        }

        return zip(msg);
    }
}

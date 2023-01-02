import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    private int order;
    private int turn = 0;
    private List<String> words = new ArrayList<>();

    public Player(int order, List<String> words) {
        this.order = order;
        this.words = words;
    }

    public Player(int order) {
        this.order = order;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Player otherPlayer = (Player) object;

        return order == otherPlayer.order
                && Objects.equals(words, otherPlayer.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, words);
    }

    public int order() {
        return order;
    }

    public void add(String word) {
        this.words.add(word);
    }

    public int words() {
        return words.size();
    }

    public List<String> speak(int index, List<String> words) {
        turn += 1;
        words.add(this.words.get(index));

        return words;
    }

    public int turn() {
        return turn;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n, String[] words) {
        return play(setPlayers(n, words));
    }

    public List<Player> setPlayers(int participantsCount, String[] words) {
        List<Player> players = new ArrayList<>();

        IntStream.range(0, participantsCount)
                .forEach((number) -> players.add(new Player(number + 1)));

        IntStream.range(0, words.length)
                .forEach((index) -> players.get(index % participantsCount).add(words[index]));

        return players;
    }


    public int[] play(List<Player> players) {
        int[] failure = new int[]{0, 0};

        List<String> words = new ArrayList<>();

        int wordsCount = players.stream()
                .map((player) -> player.words())
                .mapToInt(Integer::intValue)
                .sum();

        for (int i = 0; i < wordsCount; i += 1) {
            Player player = players.get(i % players.size());
            List<String> addend = player.speak(i / players.size(), words);

            if (!check(addend)) {
                failure[0] = player.order();
                failure[1] = player.turn();

                System.out.println(failure[0]);

                break;
            }
        }

        return failure;
    }

    public boolean check(List<String> words) {
        if (words.size() == 1) {
            return true;
        }

        if (words.get(words.size() - 1).length() < 2) {
            return false;
        }

        String lastTwo = words.get(words.size() - 2);
        String last = words.get(words.size() - 1);

        if (words.indexOf(last) < words.size() - 1) {
            return false;
        }

        if (lastTwo.charAt(lastTwo.length() - 1) != last.charAt(0)) {
            return false;
        }

        return true;
    }
}

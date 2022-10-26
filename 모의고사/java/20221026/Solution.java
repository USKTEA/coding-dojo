import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] answers) {
        return pickTheHighestScoreEntrantById(ranking(answers));
    }

    public List<Entrant> ranking(int[] answers) {
        return entrants().stream()
                .map(entrant -> entrant.match(answers))
                .sorted((entrant1, entrant2) -> {
                    if (entrant1.score() == entrant2.score()) {
                        return entrant1.id() - entrant2.id();
                    }

                    return entrant2.score() - entrant1.score();
                }).collect(Collectors.toList());
    }

    public int[] pickTheHighestScoreEntrantById(List<Entrant> ranking) {
        Entrant highestScoreEntrant = ranking.stream().findFirst().get();

        return ranking.stream()
                .filter(entrant -> entrant.score() == highestScoreEntrant.score())
                .mapToInt(entrant -> entrant.id())
                .toArray();
    }

    public List<Entrant> entrants() {
        return Arrays.asList(
                new Entrant(1, new int[]{1, 2, 3, 4, 5}),
                new Entrant(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                new Entrant(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5})
        );
    }
}

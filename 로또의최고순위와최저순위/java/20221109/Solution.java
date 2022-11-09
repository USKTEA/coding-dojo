import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int minimumScore = getMinimumScore(lottos, win_nums);
        int magicNumber = countMagicNumber(lottos);
        int[] highestAndLowest = getHighestAndLowest(minimumScore, magicNumber);
        int[] rankings = getRankings(highestAndLowest);

        return rankings;
    }

    public int getMinimumScore(int[] lotto, int[] winNumbers) {
        List<Integer> winNumber = Arrays.stream(winNumbers)
                .boxed()
                .collect(Collectors.toList());

        return IntStream.range(0, winNumber.size())
                .reduce(0, (acc, index) -> winNumber.contains(lotto[index]) ? acc + 1 : acc);
    }

    public int countMagicNumber(int[] lotto) {
        return IntStream.range(0, lotto.length)
                .reduce(0, (acc, index) -> lotto[index] == 0 ? acc + 1 : acc);
    }

    public int getMaximum(int minimumScore, int magicNumbers) {
        return minimumScore + magicNumbers;
    }

    public int[] getHighestAndLowest(int minimumScore, int magicNumbers) {
        return new int[]{getMaximum(minimumScore, magicNumbers), minimumScore};
    }

    public int[] getRankings(int[] scores) {
        return new int[]{getRanking(scores[0]), getRanking(scores[1])};
    }

    public int getRanking(int score) {
        return switch (score) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}

import java.util.stream.IntStream;

public class Entrant {
    private int id;
    private int[] answerPattern;
    private int score;

    public Entrant(int id, int[] answerPattern) {
        this.id = id;
        this.answerPattern = answerPattern;
    }

    public int[] answerPattern() {
        return answerPattern;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        Entrant otherEntrant = (Entrant) other;

        return id == otherEntrant.id;
    }

    @Override
    public String toString() {
        return "id:" + id;
    }

    public Entrant match(int[] answers) {
        score = IntStream.rangeClosed(0, answers.length - 1)
                .reduce(0, (acc, cur) -> {
                    if (answers[cur] == answerPattern[cur % answerPattern.length]) {
                        return acc += 1;
                    }

                    return acc;
                });

        return this;
    }

    public int score() {
        return score;
    }

    public int id() {
        return id;
    }
}

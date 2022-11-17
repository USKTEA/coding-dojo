import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public String solution(int[] ints, String priorHand) {
        StringBuilder stringBuilder = new StringBuilder();

        int[] changed = zeroToEleven(ints);

        Human human = Human.of(priorHand);

        IntStream.range(0, changed.length)
                .forEach((index) -> stringBuilder.append(human.type(changed[index])));

        return stringBuilder.toString();
    }

    public Human createHuman(String priorHand) {
        return new Human(priorHand);
    }

    public int[] zeroToEleven(int[] ints) {
        return Arrays.stream(ints).map((number) -> number == 0 ? 11 : number).toArray();
    }
}

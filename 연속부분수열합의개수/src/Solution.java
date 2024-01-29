import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] elements) {
        return setOfSequence(elements.length, toCircleSequence(elements)).size();
    }

    public int[] toCircleSequence(int[] elements) {
        int[] circleSequence = new int[elements.length + elements.length - 1];

        for (int i = 0; i < elements.length * 2 - 1; i += 1) {
            if (i >= elements.length) {
                circleSequence[i] = elements[i - elements.length];

                continue;
            }

            circleSequence[i] = elements[i];
        }

        return circleSequence;
    }

    public Set<Integer> sumOfSequence(int sequence, int elementsLength, int[] circleSequence) {
        Set<Integer> sequences = new HashSet<>();
        int temp = 0;

        for (int i = 0; i < elementsLength; i += 1) {
            for (int j = 0; j < sequence; j += 1) {
                temp += circleSequence[i + j];
            }

            sequences.add(temp);
            temp = 0;
        }

        return sequences;
    }

    public Set<Integer> setOfSequence(int elementsLength, int[] circleSequence) {
        Set<Integer> sequences = new HashSet<>();

        for (int i = 1; i < elementsLength + 1; i += 1) {
            Set<Integer> subSequences = sumOfSequence(i, elementsLength, circleSequence);

            subSequences.stream().forEach((element) -> sequences.add(element));
        }

        return sequences;
    }
}

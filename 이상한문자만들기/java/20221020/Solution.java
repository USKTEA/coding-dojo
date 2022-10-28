import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String word) {
        return toWeirdString(letters(word));
    }

    public List<Letter> letters(String word) {
        List<Letter> letters = new ArrayList<>();

        IntStream.range(0, word.length()).forEach((index) -> {
            String currentLetter = Character.toString(word.charAt(index));

            boolean shouldUpper = true;

            shouldUpper = checkShouldUpper(letters, index, shouldUpper);

            letters.add(new Letter(currentLetter, shouldUpper));
        });

        return letters;
    }

    private boolean checkShouldUpper(List<Letter> letters, int index, boolean shouldUpper) {
        if (index > 0) {
            Letter previousLetter = letters.get(index -1);
            boolean isPreviousLetterBlank = previousLetter.isBlank();
            boolean isPreviousLetterUpperCase = previousLetter.isUpper();

            if (isPreviousLetterUpperCase) {
                shouldUpper = false;
            }

            if (isPreviousLetterBlank) {
                shouldUpper = true;
            }
        }

        return shouldUpper;
    }

    public String toWeirdString(List<Letter> letters) {
        StringBuilder stringBuilder = new StringBuilder();

        letters.forEach((letter) -> {
            stringBuilder.append(letter.toString());
        });

        return stringBuilder.toString();
    }
}

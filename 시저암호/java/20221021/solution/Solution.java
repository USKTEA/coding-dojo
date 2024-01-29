package solution;

import models.Letter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String word, int number) {
        return lettersToString(push(convert(word), number));
    }

    public List<Letter> convert(String word) {
        List<Letter> letters = new ArrayList<>();

        Arrays.stream(word.split("")).forEach((letter) -> letters.add(
                new Letter(letter)
        ));

        return letters;
    }

    public List<Letter> push(List<Letter> letters, int number) {
        return letters.stream().map((letter) -> letter.push(number)).collect(Collectors.toList());
    }

    public String lettersToString(List<Letter> letters) {
        StringBuilder stringBuilder = new StringBuilder();

        letters.stream().forEach(letter -> stringBuilder.append(letter.value()));

        return stringBuilder.toString();
    }
}

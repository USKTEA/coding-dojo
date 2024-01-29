import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Solution {

    public String solution(String sequence) {
        Set<String> letters = choiceAlphabet(sequence);

        if (letters.size() == 26) {
            return "perfect";
        }

        return lostAlphabets(letters);
    }

    public String lostAlphabets(Set<String> letters) {
        List<String> alphabets = setAlphabets();
        StringBuilder stringBuilder = new StringBuilder();

        for (String letter : letters) {
            if (alphabets.contains(letter)) {
                alphabets.remove(letter);
            }
        }

        for (String letter : alphabets) {
            stringBuilder.append(letter);
        }

        return stringBuilder.toString();
    }

    private List<String> setAlphabets() {
        List<String> alphabets = new ArrayList<>();

        for (int i = 0; i < 26; i += 1) {
            alphabets.add(Character.toString(i + 97));
        }

        return alphabets;
    }

    public Set<String> choiceAlphabet(String sequence) {
        Set<String> letters = new HashSet<>();

        for (int i = 0; i < sequence.length(); i += 1) {
            if (isAlphabet(sequence.charAt(i))) {
                letters.add(String.valueOf(sequence.charAt(i)).toLowerCase());
            }
        }

        return letters;
    }

    private boolean isAlphabet(int ascii) {
        if (isUpperCase(ascii)) {
            return true;
        }

        if (isLowerCase(ascii)) {
            return true;
        }

        return false;
    }
}

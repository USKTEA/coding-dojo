import java.util.Objects;

public class Solution {
    public int solution(String word) {
        String current = "";
        int order = 0;

        while (!Objects.equals(current, word)) {
            order += 1;
            current = nextWord(current);
        }

        return order;
    }

    public String nextWord(String current) {
        if (current.length() < 5) {
            return current + "A";
        }

        int index = current.length() - 1;
        String character = getCharacter(current, index);
        String nextCharacter = getNextCharacter(character);

        while (hasCarry(nextCharacter)) {
            index -= 1;
            character = getCharacter(current, index);
            nextCharacter = getNextCharacter(character);
        }

        return current.substring(0, index) + nextCharacter;
    }

    private boolean hasCarry(String nextCharacter) {
        return Objects.equals(nextCharacter, "");
    }

    public String getNextCharacter(String lastCharacter) {
        return switch (lastCharacter) {
            case "A" -> "E";
            case "E" -> "I";
            case "I" -> "O";
            case "O" -> "U";
            case "U" -> "";
            default -> throw new IllegalArgumentException();
        };
    }

    private String getCharacter(String current, int index) {
        return String.valueOf(current.charAt(index));
    }
}

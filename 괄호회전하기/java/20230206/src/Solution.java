import java.util.Objects;

public class Solution {
    public int solution(String s) {
        String[] brackets = s.split("");

        int answer = 0;

        String small = "";
        String middle = "";
        String big = "";

        for (int i = 0; i < brackets.length; i += 1) {
            if (i != 0) {
                brackets = rotate(brackets);
            }
            
            for (int j = 0; j < brackets.length; j += 1) {
                if (isBig(brackets[j])) {
                    big = big + brackets[j];
                }

                if (isMiddle(brackets[j])) {
                    middle = middle + brackets[j];
                }

                if (isSmall(brackets[j])) {
                    small = small + brackets[j];
                }

                boolean result = validate(small, middle, big);

                if (!result) {
                    small = "";
                    middle = "";
                    big = "";

                    break;
                }

                if (Objects.equals(big, "{}")) {
                    big = "";
                }

                if (Objects.equals(middle, "[]")) {
                    middle = "";
                }

                if (Objects.equals(small, "()")) {
                    small = "";
                }

                if (j == brackets.length - 1) {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    private boolean validate(String small, String middle, String big) {
        if (Objects.equals(small, ")(")) {
            return false;
        }

        if (Objects.equals(middle, "][")) {
            return false;
        }

        if (Objects.equals(big, "}{")) {
            return false;
        }

        return true;
    }

    private boolean isSmall(String bracket) {
        return Objects.equals(bracket, "(") || Objects.equals(bracket, ")");
    }

    private boolean isMiddle(String bracket) {
        return Objects.equals(bracket, "[") || Objects.equals(bracket, "]");
    }

    private boolean isBig(String bracket) {
        return Objects.equals(bracket, "{") || Objects.equals(bracket, "}");
    }

    public String[] rotate(String[] brackets) {
        String[] rotated = new String[brackets.length];

        for (int i = 1; i < brackets.length; i += 1) {

            rotated[i - 1] = brackets[i];
        }

        rotated[rotated.length - 1] = brackets[0];

        return rotated;
    }
}

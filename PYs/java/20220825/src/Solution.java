public class Solution {
    public boolean solution(String s) {
        String inputsToLowerCase = s.toLowerCase();

        int differences = 0;

        for (int i = 0; i < inputsToLowerCase.length(); i += 1) {
            if (inputsToLowerCase.charAt(i) - 112 == 0) {
                differences += 1;
            }

            if (inputsToLowerCase.charAt(i) - 121 == 0) {
                differences -= 1;
            }
        }

        return differences == 0;
    }
}

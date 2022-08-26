public class Solution {
    public int solution(int n) {
        int decimal = 0;

        for (int i = 2; i < n + 1; i += 1) {
            int squirt = (int)(double)Math.sqrt(n);
            boolean isDecimal = true;

            for (int j = 2; j <= squirt; j += 1) {
                if (i % j == 0 && i != j) {
                    isDecimal = false;

                    break;
                }
            }

            if (isDecimal) {
                decimal += 1;
            }
        }

        return decimal;
    }
}

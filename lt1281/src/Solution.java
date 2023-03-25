public class Solution {

    public int subtractProductAndSum(int n) {
        String digits = Integer.toString(n);

        int sum = sum(digits);
        int product = product(digits);

        return product - sum;
    }

    public int product(String digits) {
        int result = 1;

        for (int i = 0; i < digits.length(); i += 1) {
            result *= Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        return result;
    }

    public int sum(String digits) {
        int result = 0;

        for (int i = 0; i < digits.length(); i += 1) {
            result += Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        return result;
    }
}

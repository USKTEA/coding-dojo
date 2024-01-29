public class Solution {
    public boolean match(int number, int toMatch) {
        int acc = 0;

        for (int i = number; i < toMatch; i += 1) {
            acc += i;

            if (acc > toMatch) {
                return false;
            }

            if (acc == toMatch) {
                return true;
            }
        }

        return false;
    }

    public int solution(int number) {
        int count = 0;

        for (int i = 1; i < Math.ceil(number / 2); i += 1) {
            if (match(i, number)) {
                count += 1;
            }
        }

        return count + 1;
    }
}

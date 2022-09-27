import java.awt.Panel;

public class Solution {
    public int solution(long num) {
        int count = 0;

        while (true) {
            if (num == 1) {
                return count;
            }

            if (count == 500) {
                return -1;
            }

            if (num % 2 == 0) {
                num /= 2;

                count += 1;

                continue;
            }

            num = num * 3 + 1;

            count += 1;
        }
    }
}

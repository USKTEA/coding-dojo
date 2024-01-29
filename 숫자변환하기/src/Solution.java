public class Solution {
    int count = 0;

    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }

        xToY(x, y, n, 0);

        return count == 0 ? -1 : count;
    }

    public void xToY(int x, int y, int n, int current) {
        current += 1;

        for (int i = 0; i < 3; i += 1) {
            if (i == 0) {
                x += n;
            }

            if (i == 1) {
                x = x * 2;
            }

            if (i == 2) {
                x = x * 3;
            }

            if (x < y) {
                xToY(x, y, n, current);
            }

            if (x == y) {
                if (count == 0) {
                    count = current;

                    break;
                }


                count = Math.min(count, current);
            }
        }
    }
}

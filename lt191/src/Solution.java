public class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i += 1) {
            if ((n & 1) == 1) {
                count += 1;
            }

            n = n >> 1;
        }

        return count;
    }
}

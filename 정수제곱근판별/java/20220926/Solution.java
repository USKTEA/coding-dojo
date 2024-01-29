public class Solution {
    public long solution(long n) {
        return answer(sqrt(n));
    }

    public long sqrt(long number) {
        for (long i = 1; i <= Math.sqrt(number); i += 1) {
            if (i * i == number) {
                return i;
            }
        }

        return -1;
    }

    public long answer(long i) {
        if (i == -1) {
            return -1;
        }

        return (i + 1) * (i + 1);
    }
}

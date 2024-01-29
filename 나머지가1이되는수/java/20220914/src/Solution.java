public class Solution {
    public int solution(int n) {
        int answer = 0;

        if (isPrime(n - 1)) {
            return n - 1;
        }

        for (int i = 1; i < n; i += 1) {
            if (n % i == 1) {
                answer = i;

                break;
            }
        }

        return answer;
    }

    public boolean isPrime(int number) {
        int squirt = (int) Math.sqrt(number);

        for (int j = 2; j <= squirt; j += 1) {
            if (number % j == 0 && number != j) {
                return false;
            }
        }

        return true;
    }
}

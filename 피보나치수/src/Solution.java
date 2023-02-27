public class Solution {
    private static int DIVIDER = 1234567;

    public int solution(int n) {
        return calculateLast(getFibonacci(n));
    }

    public Fibonacci getFibonacci(int number) {
        return new Fibonacci(number);
    }

    public int calculateLast(Fibonacci fibonacci) {
        return fibonacci.divideBy(DIVIDER);
    }
}

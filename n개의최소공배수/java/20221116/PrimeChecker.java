import java.util.stream.IntStream;

public class PrimeChecker {
    public boolean isPrime(int number) {
        int squirt = (int)Math.sqrt(number);

        for (int i = 2; i <= squirt; i += 1) {
            if (number % i == 0 && number != i) {
                return false;
            }
        }

        return true;
    }
}

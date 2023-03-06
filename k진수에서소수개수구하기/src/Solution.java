import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(int n, int k) {
        return countPrimeNumber(split(changeRadix(n, k)));
    }
    
    public String changeRadix(int number, int to) {
        return Integer.toString(number, to);
    }

    public String[] split(String number) {
        return number.split("0");
    }

    public int countPrimeNumber(String[] numbers) {
        List<String> primes = new ArrayList<>();

        Arrays.stream(numbers).forEach((number) -> {
            if (number.isBlank()) {
                return;
            }

            if (isPrime(number)) {
                primes.add(number);
            }
        });

        return primes.size();
    }

    public boolean isPrime(String number) {
        double doubleNumber = Double.parseDouble(number);

        if (doubleNumber == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(doubleNumber); i += 1) {
            if (doubleNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}

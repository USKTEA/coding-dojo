import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private Set<Integer> primes = new HashSet<>();

    public int solution(String numbers) {
        String[] numberArray = numbers.split("");

        for (int i = 0; i < numberArray.length; i += 1) {
            String current = "";

            List<Integer> used = new ArrayList<>();

            used.add(i);

            countPrimes(numberArray, used, current + numberArray[i]);
        }

        return primes.size();
    }

    public void countPrimes(String[] numberArray, List<Integer> used, String current) {
        int parsed = Integer.parseInt(current);

        if (isPrime(parsed)) {
            primes.add(parsed);
        }

        for (int i = 0; i < numberArray.length; i += 1) {
            if (used.contains(i)) {
                continue;
            }

            used.add(i);

            countPrimes(numberArray, used, current + numberArray[i]);

            used.remove(Integer.valueOf(i));
        }
    }

    public boolean isPrime(int parsed) {
        if (parsed < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(parsed); i += 1) {
            if (parsed % i == 0) {
                return false;
            }
        }

        return true;
    }
}

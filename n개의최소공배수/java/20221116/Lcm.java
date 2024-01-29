import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Lcm {
    private final PrimeChecker primeChecker;
    private Map<Integer, Integer> map;

    public Lcm(PrimeChecker primeChecker, Map<Integer, Integer> map) {
        this.primeChecker = primeChecker;
        this.map = map;
    }

    public HashMap factoring(int number, int divide, HashMap<Integer, Integer> result) {
        if (number == 1) {
            return result;
        }

        if (number % divide != 0) {
            return factoring(number, divide + 1, result);
        }

        if (number % divide == 0 && !primeChecker.isPrime(number)) {
            if (result.get(divide) == null) {
                result.put(divide, 1);

                return factoring(number / divide, divide, result);
            }

            result.put(divide, result.get(divide) + 1);

            return factoring(number / divide, divide, result);
        }

        if (primeChecker.isPrime(number)) {
            if (result.get(divide) == null) {
                result.put(divide, 1);

                return result;
            }
        }

        result.put(divide, result.get(divide) + 1);

        return result;
    }

    public void disjoint(HashMap<Integer, Integer> factorized) {
        factorized.forEach(((key, value) -> {
            if (map.containsKey(key) && map.get(key) > value) {
                return;
            }

            map.put(key, value);
        }));
    }

    public int calculate(Map<Integer, Integer> map) {
        int result = 1;

        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            result *= Math.pow(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public int getLcm(int[] numbers) {
        for (int i = 0; i < numbers.length; i += 1) {
            HashMap map = factoring(numbers[i], 2, new HashMap<>());
            disjoint(map);
        }

        return calculate(map);
    }
}

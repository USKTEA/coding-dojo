import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int[] sortedA = Arrays.stream(arrayA)
                .sorted()
                .distinct()
                .toArray();

        int[] sortedB = Arrays.stream(arrayB)
                .sorted()
                .distinct()
                .toArray();

        List<Integer> arrayACommonFactors = commonFactor(sortedA);
        List<Integer> arrayBCommonFactors = commonFactor(sortedB);

        List<Integer> arrayAToDelete = new ArrayList<>();
        List<Integer> arrayBToDelete = new ArrayList<>();

        if (arrayACommonFactors.size() != 0) {
            for (int i = 0; i < arrayACommonFactors.size(); i += 1) {
                for (int j = 0; j < arrayB.length; j += 1) {
                    if (arrayB[j] % arrayACommonFactors.get(i) == 0) {
                        arrayAToDelete.add(arrayACommonFactors.get(i));

                        break;
                    }
                }
            }
        }

        if (arrayBCommonFactors.size() != 0) {
            for (int i = 0; i < arrayBCommonFactors.size(); i += 1) {
                for (int j = 0; j < arrayA.length; j += 1) {
                    if (arrayA[j] % arrayBCommonFactors.get(i) == 0) {
                        arrayBToDelete.add(arrayBCommonFactors.get(i));

                        break;
                    }
                }
            }
        }

        for (Integer number: arrayAToDelete) {
            arrayACommonFactors.remove(number);
        }

        for (Integer number: arrayBToDelete) {
            arrayBCommonFactors.remove(number);
        }

        if (arrayACommonFactors.isEmpty() && arrayBCommonFactors.isEmpty()) {
            return 0;
        }

        if (arrayACommonFactors.isEmpty() && !arrayBCommonFactors.isEmpty()) {
            return arrayBCommonFactors.get(0);
        }

        if (!arrayACommonFactors.isEmpty() && arrayBCommonFactors.isEmpty()) {
            return arrayACommonFactors.get(0);
        }

        return Math.max(arrayACommonFactors.get(0), arrayBCommonFactors.get(0));
    }

    public List<Integer> commonFactor(int[] numbers) {
        int smallest = numbers[0];

        List<Integer> factors = factors(smallest);
        Set<Integer> toDelete = new HashSet<>();

        for (int i = 1; i < numbers.length; i += 1) {
            for (int j = 0; j < factors.size(); j += 1) {
                if (numbers[i] % factors.get(j) != 0) {
                    toDelete.add(factors.get(j));

                    continue;
                }
            }
        }

        for (Integer number : toDelete) {
            factors.remove(number);
        }

        return factors;
    }

    public List<Integer> factors(int number) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }

        factors.add(number);

        factors.sort(Comparator.reverseOrder());

        return factors;
    }
}

import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n, int m) {
        int[] sorted = compare(n, m);

        return new int[] {gcf(sorted[0], sorted[1]), gcm(sorted[0], sorted[1])};
    }

    public int gcf(int n1, int n2) {
        int[] inputArray = compare(n1, n2);

        for (int i = inputArray[0]; i > 1; i -= 1) {
            if (inputArray[1] % i == 0 && inputArray[0] % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public int gcm(int n1, int n2) {
        int[] intArray = compare(n1, n2);

        for (int i = n2; ; i += n2) {
            if (i % intArray[0] == 0) {
                return i;
            }
        }
    }

    public int[] compare(int num1, int num2) {
        int[] intArray = new int[] {num1, num2};

        return IntStream.of(intArray).sorted().toArray();
    }
}

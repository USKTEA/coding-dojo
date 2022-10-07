import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] firstMap = createArray(n);
        int[][] secondMap = createArray(n);
        int[][] sum = createArray(n);
        String[] decodedMap = new String[n];

        for (int i = 0; i < firstMap.length; i += 1) {
            firstMap[i] = toBinary(arr1[i], n);
        }

        for (int i = 0; i < secondMap.length; i += 1) {
            secondMap[i] = toBinary(arr2[i], n);
        }

        for (int i = 0; i < n; i += 1) {
            sum[i] = sum(firstMap[i], secondMap[i]);
        }

        for (int i = 0; i < n; i += 1) {
            decodedMap[i] = decode(sum[i]);
        }

        return decodedMap;
    }

    public int[][] createArray(int length) {
        return new int[length][length];
    }

    public int[] toBinary(int number, int length) {
        int[] array = new int[length];
        int index = length - 1;

        while (number >= 2) {
            array[index] = number % 2;
            number /= 2;
            index -= 1;
        }

        array[index] = number;

        return array;
    }

    public int[] sum(int[] ints1, int[] ints2) {
        return IntStream.range(0, ints1.length).map(index -> Math.max(ints1[index], ints2[index])).toArray();
    }

    public String decode(int[] ints) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(ints).forEach(number -> {
            if (number == 1) {
                stringBuilder.append("#");
            }

            if (number == 0) {
                stringBuilder.append(" ");
            }
        });

        return stringBuilder.toString();
    }
}

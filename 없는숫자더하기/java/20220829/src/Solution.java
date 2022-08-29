import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<Integer> numberList;

    public int solution(int[] numbers) {
        int min = findNumber(numbers, 0);
        int max = findNumber(numbers, numbers.length - 1);
        int sumOfZeroToNine = sumOfBetween(0, 9);
        int sumOfNumbers = addNumber(numbers);

        return sumOfZeroToNine - sumOfNumbers;
    }

    public int addNumber(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public int findNumber(int[] numbers, int index) {
        numberList = new ArrayList<>();

        for (int number : numbers) {
            numberList.add(number);
        }

        Collections.sort(numberList);

        return numberList.get(index);
    }

    public int sumOfBetween(int a, int b) {
        return (a + b) * 10 / 2;
    }
}

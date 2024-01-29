public class Solution {
    public int countOne(int number) {
        return Integer.bitCount(number);
    }

    public int findNextBigger(int number, int ones) {
        if (countOne(number + 1) == ones) {
            return number + 1;
        }

        return findNextBigger(number + 1, ones);
    }

    public int solution(int number) {
        return findNextBigger(number, countOne(number));
    }
}

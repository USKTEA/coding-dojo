public class Solution {

    public int countOdds(int low, int high) {
        int count = 0;

        if (isOdd(low)) {
            count += 1;
        }

        if (isOdd(high)) {
            count += 1;
        }

        count += (high - low) / 2;

        if (allOdd(isOdd(low), isOdd(high))) {
            count -= 1;
        }

        return count;
    }

    private boolean allOdd(boolean low, boolean high) {
        return low && high;
    }

    private boolean isOdd(int number) {
        if (number == 0) {
            return false;
        }

        return number % 2 != 0;
    }
}

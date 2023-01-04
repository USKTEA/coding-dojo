public class Solution {
    int vertical = 3;

    public int[] solution(int brown, int yellow) {
        int horizontal = (brown - (vertical * 2)) / 2 + 2;

        int expectedYellowSize = (vertical - 2) * (horizontal - 2);

        if (expectedYellowSize == yellow){
            return new int[]{horizontal, vertical};
        }

        vertical += 1;

        return solution(brown, yellow);
    }
}

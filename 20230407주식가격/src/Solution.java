public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i += 1) {
            int current = prices[i];

            for (int j = i + 1; j < prices.length; j += 1) {
                if (current > prices[j] || j == prices.length - 1) {
                    answer[i] = j - i;

                    break;
                }
            }
        }

        return answer;
    }
}

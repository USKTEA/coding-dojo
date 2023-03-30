public class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    private void dfs(int[] numbers, int target, int current, int sum) {
        if (numbers.length == current) {
            if (sum == target) {
                answer += 1;
            }

            return;
        }

        dfs(numbers, target, current + 1, sum - numbers[current]);
        dfs(numbers, target, current + 1, sum + numbers[current]);
    }
}

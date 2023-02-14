public class Solution {
    public int pivotIndex(int[] nums) {
        int defaultPivotIndex = 0;

        int answer = getPivot(nums, defaultPivotIndex);

        return answer;
    }

    public int getPivot(int[] nums, int pivotIndex) {
        if (nums.length == pivotIndex) {
            return -1;
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < pivotIndex; i += 1) {
            left += nums[i];
        }

        for (int i = pivotIndex + 1; i < nums.length; i += 1) {
            right += nums[i];
        }

        if (left == right) {
            return pivotIndex;
        }

        return getPivot(nums, pivotIndex + 1);
    }
}

class Solution {
    //[1, 2, 3, 1] => 2
    //[-1]과 [무한대] 는 가장 작은 숫자로 판단한다
    //find 0, nums.lastIndex
    //peak를 찾을 떄 까지 반복
    //peak라면 index 반환
    //만약 middle이 0이라면 1만 비교
    //만약 middle이 lastIndex라면 lastIndex -1만 비교
    //없다면 -1?
    fun findPeakElement(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1
            }

            if (nums[mid] >= nums[mid + 1]) {
                right = mid
            }
        }

        return left
    }
}

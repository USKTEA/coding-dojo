class Solution {
    //[1, 2, 3, 0, 0, 0], 3 /  [2, 5, 6] 3 => [1, 2, 2, 3, 5, 6]
    //[1, 2, 3], 3
    //[1], 1 / [], 0 => [1]
    //[0], 0 / [1], 1 => [1]
    //nums1.size = m + n

    //var left = 0
    //var right = m
    //var half = m + 0 / 2
    //var pivot = nums[halft]
    //if nums2[i] > pivot , nums1List.add(i + 1, nums2[i])
    //if nums2[i] <= pivot, numsList.add(i, nums2[i])

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val nums1List = nums1.slice(0..<m).toMutableList()

        var left = 0

        for (i: Int in nums2.indices) {
            while (left < nums1List.size && nums2[i] > nums1List[left]) {
                left += 1
            }

            nums1List.add(left, nums2[i])
        }

        nums1List.forEachIndexed {index: Int, i: Int ->
            nums1[index] = i
        }
    }
}

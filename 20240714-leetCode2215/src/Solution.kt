class Solution {
    //[1, 2, 3], [2, 4, 6] => [[1, 3], [4, 6]]
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val num1Set = nums1.toMutableSet()
        val num2Set = nums2.toMutableSet()

        return num1Set.intersect(num2Set).let { intersection ->
            buildList {
                add(
                    num1Set.filter { !intersection.contains(it) }
                )
                add(
                    num2Set.filter { !intersection.contains(it) }
                )
            }
        }
    }
}

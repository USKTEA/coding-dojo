class Solution {
    //[1], [1] => [1]
    //[1], [2] => []
    //[1, 1], [1, 2] => [1]
    //[1, 2, 2, 1], [2, 2] => [2]
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val numbers1 = nums1.toSet()
        val numbers2 = nums2.toSet()

        val number1Map = numbers1.fold(mutableMapOf<Int, Int>()) { acc, i ->
            acc[i] = acc.getOrDefault(i, 0) + 1
            acc
        }

        return numbers2.fold(number1Map) { acc, i ->
            acc[i] = acc.getOrDefault(i, 0) + 1
            acc
        }.filter { (key, value) ->
            value == 2
        }.map { it.key }.toIntArray()
    }
}

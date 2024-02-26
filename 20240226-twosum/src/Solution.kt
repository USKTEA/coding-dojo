class Solution {
    fun twoSum(intArray: IntArray, target: Int): IntArray {
        var first = 0
        var second = 0

        for (i: Int in intArray.indices) {
            for (j: Int in i + 1..<intArray.size) {
                if (intArray[i] + intArray[j] == target) {
                    first = i
                    second = j
                }
            }
        }

        return intArrayOf(first, second)
    }
}

class Solution {
    //[1, 2, 2, 1, 1, 3] => true
    //[1] => true
    //[1, 2] => false
    //mutableMap(number, count)
    //return map.values.size == map.value.toSet().size
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val numbers = arr.fold(mutableMapOf<Int, Int>()) { acc, number ->
            val count = acc.getOrDefault(number, 0)

            acc[number] = count + 1
            acc
        }

        return numbers.values.size == numbers.values.toSet().size
    }
}

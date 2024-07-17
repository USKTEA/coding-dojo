class Solution {
    //[1, 2, 2, 1, 1, 3] => true
    //[1, 2] => false
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val occurrences = arr.fold(mutableMapOf<Int, Int>()) { occurrences, number ->
            occurrences[number] = occurrences.getOrDefault(number, 0) + 1
            occurrences
        }

        return occurrences.size == occurrences.values.toSet().size
    }
}

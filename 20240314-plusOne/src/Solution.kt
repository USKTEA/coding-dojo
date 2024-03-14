class Solution {
    //[0] => [1]
    //[1] => [2]
    //[1, 0] => [1, 1]
    //[9] => [1, 0]
    //[1, 9] => [2, 0]
    fun plusOne(digits: IntArray): IntArray {
        val (added, toAdd) = intArrayOf(0, *digits).reversed()
            .fold(Pair(mutableListOf<Int>(), 1)) { (numbers, toAdd), number ->
                val added = number + toAdd

                if (added > 9) {
                    numbers.add(0)

                    return@fold Pair(numbers, 1)
                }

                numbers.add(added)
                Pair(numbers, 0)
            }

        val reversed = added.reversed()

        if (reversed.first() == 0) {
            return reversed.subList(1, reversed.size).toIntArray()
        }

        return reversed.toIntArray()
    }
}

class Solution {
    //[1, 2, 3] => [1, 2, 3]
    //[1, 1000] => [1, 1000]
    //[1, 1000, 2] => [1, 2, 1000]

    //[1, 1000, 2],
    //[1000, 2] 1
    //[2, 1000]
    //[1000] 2
    //[1000]
    //[]  1000


    //[]
    //[1000]
    //[2, 1000]
    //

    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        //[1, 2, 3] => [1, 3, 2]
        //[0, 2, 1]

        val indices = IntArray(deck.size)
            .mapIndexed { index: Int, _: Int -> index }
            .toMutableList()

        val sorted = deck.sorted()

        val result = IntArray(deck.size)

        for (i in sorted.indices) {
            if (indices.isNotEmpty()) {
                result[indices.removeFirst()] = sorted[i]
            }

            if (indices.isNotEmpty()) {
                indices.add(indices.removeFirst())
            }
        }

        return result
    }
}

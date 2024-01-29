class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        return calculateMaxSize(sizes.map { switch(it) }).area()
    }

    fun calculateMaxSize(switched: List<IntArray>): IntArray {
        return switched.fold(intArrayOf(0, 0)) { acc, size ->
            intArrayOf(acc[0].coerceAtLeast(size[0]), acc[1].coerceAtLeast(size[1]))
        }
    }

    fun switch(size: IntArray): IntArray {
        if (size[0] >= size[1]) {
            return size
        }

        return intArrayOf(size[1], size[0])
    }
}

private fun IntArray.area(): Int {
    return this[0] * this[1]
}

class QuickSort {
    fun process(intArrayOf: IntArray): IntArray {
        var pivot = intArrayOf.size / 2
        var end = intArrayOf.lastIndex
        var toSort = intArrayOf

        while (pivot != 0) {
            toSort = sort(pivot, end, intArrayOf)
            pivot /= 2
        }

        return toSort
    }

    fun sort(pivot: Int, end: Int, numbers: IntArray): IntArray {
        val mid = numbers[pivot]
        var toSort = numbers.clone()

        for (i: Int in 0 .. end) {
            if (mid < numbers[i]) {
                val temp = toSort[pivot]
                toSort[pivot] = toSort[i]
                toSort[i] = temp

                continue
            }

            if (i == pivot + 1) {
                if (toSort[pivot] > toSort[pivot + 1]) {
                    val temp = toSort[pivot + 1]
                    toSort[pivot + 1] = toSort[pivot]
                    toSort[pivot] = temp
                }

                continue
            }

            if (toSort[i] > mid) {
                val temp = toSort[end]
                toSort[end] = toSort[i]
                toSort[i] = temp
            }
        }

        return toSort
    }
}

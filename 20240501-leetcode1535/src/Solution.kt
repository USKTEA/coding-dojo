class Solution {
    //[2, 1, 3, 5, 4, 6, 7], 2 => 5
    //compare(arr[0], arr[1])
    //winCount += 1
    //if (winCount == k) { return arr[0] }
    //exchange

    fun getWinner(arr: IntArray, k: Int): Int {
        val winner = getWinner(
            numbers = arr.toMutableList(),
            winCount = k,
            current = 0,
            meets = mutableSetOf(arr[0])
        )

        return winner
    }

    private fun getWinner(
        numbers: MutableList<Int>,
        winCount: Int,
        current: Int,
        meets: MutableSet<Int> = mutableSetOf()
    ) : Int {
        if (meets.size == numbers.size) {
            return numbers[0]
        }

        if (current == winCount) {
            return numbers[0]
        }

        meets.add(numbers[1])

        if (numbers[0] > numbers[1]) {
            val removed = numbers.removeAt(1)
            numbers.add(removed)

            return getWinner(
                numbers = numbers,
                winCount = winCount,
                current = current + 1,
                meets = meets
            )
        }

        val removed = numbers.removeAt(0)
        numbers.add(removed)

        return getWinner(
            numbers = numbers,
            winCount = winCount,
            current = 1,
            meets = meets
        )
    }
}

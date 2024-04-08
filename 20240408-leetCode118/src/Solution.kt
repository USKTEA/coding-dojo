class Solution {
    // 1 => [[1]]
    // 2 => [[1], [1, 1]]
    // 3 => [[1], [1, 1],[1, 2, 1]]
    // row(before, 1)
    // if (before == null) => List(1) { 1 }
    // row(before, 2)
    // List(2) { if(currentIndex - 1 >= 0 ++ , if currentIndex + 1 < before.index -1 ++)  }
    fun generate(numRows: Int): List<List<Int>> {
        val rowNumbers = toRowNumbers(numRows)

        return rowNumbers.foldIndexed(mutableListOf()) { index, acc, i ->
            if (index == 0) {
                acc.add(listOf(1))

                return@foldIndexed acc
            }

            val beforeRow = acc[index - 1]
            val currentRow = List(i) { 0 }.toMutableList().mapIndexed { index, i ->
                if (index - 1 < 0) {
                    return@mapIndexed beforeRow[index]
                }

                if (index == beforeRow.size) {
                    return@mapIndexed beforeRow[index - 1]
                }

                return@mapIndexed beforeRow[index] + beforeRow[index - 1]
            }

            acc.add(currentRow)
            acc
        }
    }

    fun toRowNumbers(numRows: Int): List<Int> {
        return List(numRows) { 1 }.mapIndexed { index: Int, i: Int -> i + index }
    }
}

class Solution {
    //0 =>       [1]
    //1 =>      [1, 1]
    //2 =>     [1, 2, 1]
    //3 =>    [1, 3, 3, 1]
    //4 =>   [1, 4, 6, 4, 1]
    //5 =>  [1, 5, 10, 10, 5, 1]
    //6=> [1, 6, 15, 20, 15, 6, 1]


    fun getRow(row: Int): ArrayList<Int> {
        var rowNumbers = arrayListOf<Int>()
        rowNumbers.add(1)

        for (i: Int in 1..row) {
            val currentRow = arrayListOf<Int>()
            currentRow.add(1)

            for (j: Int in 1..<rowNumbers.size) {
                currentRow.add(rowNumbers[j] + rowNumbers[j - 1])
            }

            currentRow.add(1)
            rowNumbers = currentRow
        }

        return rowNumbers
    }
}

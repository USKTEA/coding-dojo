class Solution {
    //board.forEachIndexed { y, line -> line.forEachIndexed { x, number ->  }
    //rows[y].add(number) if false return false
    //colums[x].add(number) if false return false
    //[[0,0], [0, 1] [0, 2]] matrix = matrix[x % 3, y % 3]
    //matrix.add(number) if false return false
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = List(board.size) { mutableSetOf<Char>() }
        val columns = List(board.size) { mutableSetOf<Char>() }
        val matrix = List(3) {
            List(3) {
                mutableSetOf<Char>()
            }
        }


        board.forEachIndexed { y, line ->
            line.forEachIndexed { x, char ->
                if (char == '.') {
                    return@forEachIndexed
                }

                println(matrix)

                val rowResult = rows[y].add(char)
                val columnResult = columns[x].add(char)
                val matrixResult = matrix[y / 3][x / 3].add(char)

                if (!(rowResult && columnResult && matrixResult)) {
                    return false
                }
            }
        }

        return true
    }
}

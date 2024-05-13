class Solution {
    //[[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
    //[1] => [1]
    //[[1, 2], [3, 4]] => [[3, 1], [4, 2]]

    //[[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

    //0, 0,=> 0, array[0].lastIndex - 0
    //0, 1 => 1, array[1].lastIndex - 0
    //0, 2 => 2, array[2].lastIndex - 0

    //1, 0 => 0, array[0].lastIndex - 1
    //1, 1 => 1, array[1].lastIndex - 1
    //1, 2 => 2, array[2].lastIndex - 1

    //2, 0 => 0, array[0].lastIndex -2
    //2, 1 => 1, array[1].lastIndex -2
    //2, 2 => 2, array[2].lastIndex -2
    //rotate(x, y, matrix)
    //val temp = matrix[y][array[y].lastIndex - x)
    //matrix[y][array[y].lastIndex - x) = matrix[x][y]
    //matrix[x][y] = temp
    fun rotate(matrix: Array<IntArray>) {
        val switched = mutableListOf<Pair<Int, Int>>()

        for (y: Int in matrix.indices) {
            for (x: Int in matrix[0].lastIndex downTo 0) {
                if (switched.contains(Pair(y, x))) {
                    continue
                }

                switch(y, x, matrix)

                switched.add(Pair(y, x))
                switched.add(Pair(x, matrix[x].lastIndex - y))
            }
        }
    }

    fun switch(y: Int, x: Int, matrix: Array<IntArray>) {
        val temp = matrix[x][matrix[x].lastIndex - y]
        matrix[x][matrix[x].lastIndex - y] = matrix[y][x]
        matrix[y][x] = temp
    }
}

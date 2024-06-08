import org.junit.jupiter.api.Assertions

class Solution {
    //[[1, 2], [3, 4]] => [[3, 1], [4, 2]]
    //[[1]] => [[1]]
    //n = 2
    //[0, 0] => [0, 1] x = n - 1 - y, y = x
    //[0, 1] => [1, 1] x = n - 1 - y,  y = x
    //[1, 0] => [0, 1] y = n - 1 - y, x = y
    //[1, 1] => [1, 0] y = n - 1 - y, x = y

    //n = 3
    //[0, 0] => [0, 2], x = n - 1 - y, y = x
    //[0, 1] => [1, 2], x = n - 1 - y, y = x
    //[0, 2] => [2, 2], x = n - 1 - y, y = x

    //[1, 0] => [0, 1], x = n - 1 - y, y = x
    //[1, 1] => [1, 1], x = n - 1 - y, y = x
    //[1, 2] => [2, 1], x = n - 1 - y, y = x

    //[2, 0] => [0, 0], x = n - 1 - 2, y = x
    //[2, 1] => [1, 0], x = n - 1 - 2, y = x
    //[2, 2] => [2, 0], x = n - 1 - 2, y = x
    fun rotate(matrix: ArrayList<ArrayList<Int>>) {
        val switched = mutableSetOf<Pair<Int, Int>>()

        matrix.forEachIndexed { y, line ->
            for (x: Int in line.lastIndex  downTo 0) {
                if (switched.contains(Pair(y, x))) {
                    continue
                }

                switch(y, x, matrix)
                switched.add(Pair(y, x))
                switched.add(Pair(x, line.lastIndex - y))
            }
        }
    }

    fun switch(y: Int, x: Int, matrix: ArrayList<ArrayList<Int>>) {
        val temp = matrix[x][matrix[x].lastIndex - y]
        matrix[x][matrix[x].lastIndex - y] = matrix[y][x]
        matrix[y][x] = temp
    }
}

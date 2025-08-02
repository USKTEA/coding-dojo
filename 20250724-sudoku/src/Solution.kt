class Solution {

    //숫자는 1~9까지 있음
    //rows, columns, squares 는 모두 동일한 point를 공유한다.
    //point는 y,x 값과 value가 있다.
    //y는 columns, x는 rows, xy는 squares를 정한다.
    //squres는 y % 3 + x % 3의 값으로 정한다


    //0,0 => 0
    //0,3 => 1
    //0,6 => 2

    //3,0 => 3
    //


    //0,0 ~ 2,2 => 0
    //0,0 => 0
    //0,1 => 1
    //0,2 => 2
    //1,0 => 3
    //1,1 => 4
    //1,2 => 5
    //2,0 => 6
    //3,3


    //3,3 ~ 5,5 => 1
    //6,6 ~ 8,8 => 2


    //column, rows, squares는 동일한 값을 가지면 안된다.
    //board를 순회하면서 중복된 것을 확인하고 중복된다면 다음 숫자, ㄱㄱ

    fun solveSudoku(board: ArrayList<ArrayList<Char>>) {
        val rows = List(board.size) { MutableList(board.size) { Point.empty } }
        val columns = List(board.size) { MutableList(board.size) { Point.empty } }
        val regions = List(board.size) { MutableList(board.size) { Point.empty } }

        fillPoints(board, rows, columns, regions)
        solve(board, rows, columns, regions)
    }

    private fun solve(
        board: ArrayList<ArrayList<Char>>,
        rows: List<MutableList<Point>>,
        columns: List<MutableList<Point>>,
        regions: List<MutableList<Point>>,
    ): Boolean {
        val cell = findEmptyCell(board)

        if (cell == null) {
            return true
        }

        val (y, x) = cell

        ('1'..'9').forEach { number ->
            if (isValid(y, x, number, rows, columns, regions)) {
                placeNumber(board, rows, number, y, x)

                if (solve(board, rows, columns, regions)) {
                    return true
                }

                removeNumber(board, rows, y, x)
            }
        }

        return false
    }

    private fun removeNumber(
        board: ArrayList<ArrayList<Char>>,
        rows: List<MutableList<Point>>,
        y: Int,
        x: Int,
    ) {
        board[y][x] = '.'
        rows[y][x].value = '.'
    }

    private fun placeNumber(
        board: ArrayList<ArrayList<Char>>,
        rows: List<MutableList<Point>>,
        number: Char,
        y: Int,
        x: Int,
    ) {
        board[y][x] = number
        rows[y][x].value = number
    }

    private fun isValid(
        y: Int,
        x: Int,
        number: Char,
        rows: List<MutableList<Point>>,
        columns: List<MutableList<Point>>,
        regions: List<MutableList<Point>>,
    ): Boolean {
        if (rows[y].any { it.value == number }) {
            return false
        }

        if (columns[x].any { it.value == number }) {
            return false
        }

        val regionsY = (y / 3) * 3 + x / 3

        if (regions[regionsY].any { it.value == number }) {
            return false
        }

        return true
    }


    private fun findEmptyCell(board: ArrayList<ArrayList<Char>>): Point? {
        board.forEachIndexed { y, row ->
            row.forEachIndexed { x, column ->
                if (column == '.') {
                    return Point(y, x)
                }
            }
        }

        return null
    }

    private fun fillPoints(
        board: ArrayList<ArrayList<Char>>,
        rows: List<MutableList<Point>>,
        columns: List<MutableList<Point>>,
        regions: List<MutableList<Point>>,
    ) {
        board.forEachIndexed { y, row ->
            row.forEachIndexed { x, element ->
                val point = Point(y = y, x = x, value = element)

                rows[y][x] = point
                columns[x][y] = point

                val regionY = (y / 3) * 3 + (x / 3)
                val regionX = (y % 3) * 3 + (x % 3)
                regions[regionY][regionX] = point
            }
        }
    }

    data class Point(val y: Int, val x: Int, var value: Char = '.') {
        companion object {
            val empty = Point(-1, -1)
        }
    }
}


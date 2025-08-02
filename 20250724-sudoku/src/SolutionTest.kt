import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solveSudoku() {
        val board = arrayListOf(
            arrayListOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            arrayListOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            arrayListOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            arrayListOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            arrayListOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            arrayListOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            arrayListOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            arrayListOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            arrayListOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )

        solution.solveSudoku(board)

        assertEquals(
            arrayListOf(
                arrayListOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                arrayListOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                arrayListOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                arrayListOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                arrayListOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                arrayListOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                arrayListOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                arrayListOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                arrayListOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            ), board
        )
    }
}

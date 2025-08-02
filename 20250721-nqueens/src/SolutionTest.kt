import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solveNQueens() {
        val result = solution.solveNQueens(4)

        assertEquals(
            arrayListOf(
                arrayListOf(
                    ".Q..",
                    "...Q",
                    "Q...",
                    "..Q."
                ),
                arrayListOf(
                    "..Q.",
                    "Q...",
                    "...Q",
                    ".Q.."
                ),
            ), result
        )
    }
}

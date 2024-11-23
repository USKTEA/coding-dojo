import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchMatrix() {
        val result = solution.searchMatrix(
            arrayListOf(
                arrayListOf(1, 3, 5, 7),
                arrayListOf(10, 11, 16, 20),
                arrayListOf(23, 30, 34, 50),
            ), 3
        )

        assertEquals(1, result)
    }

    @Test
    fun searchMatrix_2() {
        val result = solution.searchMatrix(
            arrayListOf(
                arrayListOf(5, 17, 100, 111),
                arrayListOf(119, 120, 127, 131),
            ), 3
        )

        assertEquals(0, result)
    }
}

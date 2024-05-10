import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.numSquares(25)
        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.numSquares(12)
        assertEquals(3, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.numSquares(55)
        assertEquals(4, result)
    }

    @Test
    fun countSquare_25_5() {
        val result = solution.countSquares(25, 5)
        assertEquals(1, result)
    }

    @Test
    fun countSquare_25_4() {
        val result = solution.countSquares(25, 4)
        assertEquals(2, result)
    }

    @Test
    fun countSquare_12_3() {
        val result = solution.countSquares(12, 3)
        assertEquals(4, result)
    }

    @Test
    fun countSquare_13_3() {
        val result = solution.countSquares(13, 3)
        assertEquals(2, result)
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun prevSmaller() {
        val result = solution.prevSmaller(arrayListOf(4, 5, 2, 10, 8))

        assertEquals(arrayListOf(-1, 4, -1, 2, 2), result)
    }

    @Test
    fun prevSmaller_2() {
        val result = solution.prevSmaller(arrayListOf(3, 2, 1))

        assertEquals(arrayListOf(-1, -1, -1), result)
    }
}

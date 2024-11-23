import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pow() {
        val result = solution.pow(2, 3, 3)

        assertEquals(2, result)
    }

    @Test
    fun pow_2() {
        val result = solution.pow(5, 2, 6)

        assertEquals(1, result)
    }
    @Test
    fun pow_3() {
        val result = solution.pow(-2, 3, 4)

        assertEquals(0, result)
    }

}

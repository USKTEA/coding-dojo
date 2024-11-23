import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun numSetBits() {
        val result = solution.numSetBits(11)

        assertEquals(3, result)
    }

    @Test
    fun trailingZeros() {
        val result = solution.trailingZeros(18)

        assertEquals(1, result)
    }

    @Test
    fun reverse() {
        val result = solution.reverse(3)

        assertEquals(3221225472, result)
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverse() {
        val result = solution.reverse(-123)

        assertEquals(-321, result)
    }

    @Test
    fun reverse_2() {
        val result = solution.reverse(123)

        assertEquals(321, result)
    }

    @Test
    fun reverse_3() {
        val result = solution.reverse2(123)

        assertEquals(321, result)
    }

    @Test
    fun reverse_4() {
        val result = solution.reverse2(-1146467285)

        assertEquals(0, result)
    }
}

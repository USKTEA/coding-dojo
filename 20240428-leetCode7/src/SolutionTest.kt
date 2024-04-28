import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_x_is_1() {
        assertEquals(1, solution.reverse(1))
    }

    @Test
    fun when_x_is_10() {
        assertEquals(1, solution.reverse(10))
    }
}

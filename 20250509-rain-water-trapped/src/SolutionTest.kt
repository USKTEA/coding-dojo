import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun trap() {
        val result = solution.trap(listOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))

        assertEquals(6, result)
    }

    @Test
    fun trap_2() {
        val result = solution.trap(listOf(1, 2))

        assertEquals(0, result)
    }
}

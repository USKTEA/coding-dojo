import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun minimize() {
        val result = solution.minimize(arrayListOf(1, 4, 10), arrayListOf(2, 15, 20), arrayListOf(10, 12))

        assertEquals(5, result)
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun compareVersion() {
        val result = solution.compareVersion("1.13", "1.13.4")

        assertEquals(-1, result)
    }

    @Test
    fun compareVersion_2() {
        val result = solution.compareVersion("01", "1")

        assertEquals(0, result)
    }

    @Test
    fun compareVersion_3() {
        val result = solution.compareVersion("1", "1.0")

        assertEquals(0, result)
    }
}

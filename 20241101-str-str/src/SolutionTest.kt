import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun strStr() {
        val result = solution.strStr("strstr", "str")

        assertEquals(0, result)
    }

    @Test
    fun strStr_2() {
        val result = solution.strStr("bighit", "bit")

        assertEquals(-1, result)
    }

    @Test
    fun strStr_3() {
        val result = solution.strStr("bighit", "gh")

        assertEquals(2, result)
    }
}

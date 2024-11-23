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
        val result = solution.strStr("straaastr", "aaa")

        assertEquals(3, result)
    }

    @Test
    fun lps() {
        val result = solution.calculateLps("str")

        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }

    @Test
    fun lps_2() {
        val result = solution.calculateLps("strs")

        assertArrayEquals(intArrayOf(0, 0, 0, 1), result)
    }

    @Test
    fun lps_3() {
        val result = solution.calculateLps("aaab")

        assertArrayEquals(intArrayOf(0, 1, 2, 0), result)
    }
}

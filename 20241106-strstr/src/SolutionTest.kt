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
    fun getLps() {
        val result = solution.getLps("str")

        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }

    @Test
    fun getLps_2() {
        val result = solution.getLps("strs")

        assertArrayEquals(intArrayOf(0, 0, 0, 1), result)
    }

    @Test
    fun getLps_3() {
        val result = solution.getLps("strst")

        assertArrayEquals(intArrayOf(0, 0, 0, 1, 2), result)
    }

    @Test
    fun getLps_4() {
        val result = solution.getLps("aaaabc")

        assertArrayEquals(intArrayOf(0, 1, 2, 3, 0, 0), result)
    }
}

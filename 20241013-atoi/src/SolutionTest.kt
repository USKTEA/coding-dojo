import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun atoi() {
        val result = solution.atoi("9 2704")

        assertEquals(9, result)
    }

    @Test
    fun atoi_1() {
        val result = solution.atoi("--1")

        assertEquals(0, result)
    }

    @Test
    fun atoi_2() {
        val result = solution.atoi("-1-")

        assertEquals(-1, result)
    }

    @Test
    fun atoi_3() {
        val result = solution.atoi("-11")

        assertEquals(-11, result)
    }

    @Test
    fun atoi_4() {
        val result = solution.atoi("-+11")

        assertEquals(0, result)
    }

    @Test
    fun atoi_5() {
        val result = solution.atoi("--11")

        assertEquals(0, result)
    }

    @Test
    fun atoi_6() {
        val result = solution.atoi("-11 ")

        assertEquals(-11, result)
    }

    @Test
    fun atoi_7() {
        val result = solution.atoi(" -11")

        assertEquals(-11, result)
    }

    @Test
    fun atoi_8() {
        val result = solution.atoi("  -11")

        assertEquals(-11, result)
    }

    @Test
    fun atoi_9() {
        val result = solution.atoi(" 1 -11")

        assertEquals(1, result)
    }

    @Test
    fun atoi_10() {
        val result = solution.atoi("- 5")

        assertEquals(0, result)
    }

    @Test
    fun atoi_11() {
        val result = solution.atoi("-54332872018247709407 4 54")

        assertEquals(-2147483648, result)
    }
}

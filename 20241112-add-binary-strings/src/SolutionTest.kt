import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun addBinary() {
        val result = solution.addBinary("100", "11")

        assertEquals("111", result)
    }

    @Test
    fun addBinary_2() {
        val result = solution.addBinary("110", "10")

        assertEquals("1000", result)
    }

    @Test
    fun xor() {
        val result = solution.xor('1', '1', 1)

        assertEquals(Solution.XorResult(1, 1), result)
    }

    @Test
    fun xor_2() {
        val result = solution.xor('1', '1', 0)

        assertEquals(Solution.XorResult(1, 0), result)
    }

    @Test
    fun xor_3() {
        val result = solution.xor('1', '0', 0)

        assertEquals(Solution.XorResult(0, 1), result)
    }

    @Test
    fun xor_4() {
        val result = solution.xor('0', '0', 0)

        assertEquals(Solution.XorResult(0, 0), result)
    }

    @Test
    fun xor_5() {
        val result = solution.xor('0', '0', 1)

        assertEquals(Solution.XorResult(0, 1), result)
    }

    @Test
    fun xor_6() {
        val result = solution.xor('0', '1', 0)

        assertEquals(Solution.XorResult(0, 1), result)
    }

    @Test
    fun xor_7() {
        val result = solution.xor('1', '0', 1)

        assertEquals(Solution.XorResult(1, 0), result)
    }
}

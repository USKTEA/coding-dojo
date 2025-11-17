import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        val result = solution.nchoc(5, arrayListOf(2, 4, 6, 8, 10))

        assertEquals(33, result)
    }

    @Test
    fun test2() {
        val result = solution.nchoc(10, arrayListOf(2147483647, 2000000014, 2147483647))

        assertEquals(284628164, result)
    }
}

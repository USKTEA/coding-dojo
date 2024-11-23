import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun power() {
        val result = solution.power("128")

        assertEquals(1, result)
    }

    @Test
    fun power_2() {
        val result = solution.power("20")

        assertEquals(0, result)
    }

    @Test
    fun test() {
        println(9 % 2)
    }
}

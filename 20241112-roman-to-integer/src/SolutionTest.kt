import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun romanToInt() {
        val result = solution.romanToInt("XIV")

        assertEquals(14, result)
    }

    @Test
    fun romanToInt_2() {
        val result = solution.romanToInt("XX")

        assertEquals(20, result)
    }

    @Test
    fun romanToInt_3() {
        val result = solution.romanToInt("MCIVIII")

        assertEquals(1107, result)
    }
}

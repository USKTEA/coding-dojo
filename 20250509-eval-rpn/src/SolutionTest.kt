import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun evalRPN() {
        val result = solution.evalRPN(arrayListOf("2", "1", "+", "3", "*"))

        assertEquals(9, result)
    }
}

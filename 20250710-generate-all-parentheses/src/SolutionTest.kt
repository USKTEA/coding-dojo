import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun generateParenthesis() {
        val result = solution.generateParenthesis(3)

        assertEquals(
            arrayListOf("((()))", "(()())", "(())()", "()(())", "()()()"),
            result
        )
    }
}

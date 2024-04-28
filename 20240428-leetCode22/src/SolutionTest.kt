import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_n_is_1() {
        val result = solution.generateParenthesis(1)
        assertEquals(listOf("()"), result)
    }

    @Test
    fun when_n_is_3() {
        val result = solution.generateParenthesis(3)
        assertEquals(listOf("((()))","(()())","(())()","()(())","()()()"), result)
    }
}

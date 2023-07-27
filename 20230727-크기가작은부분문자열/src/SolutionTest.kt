import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution1() {
        val solution = Solution()
        val answer = solution.solution("3141592", "271")

        assertEquals(2, answer)
    }

    @Test
    fun solution2() {
        val solution = Solution()
        val answer = solution.solution("500220839878", "7")

        assertEquals(8, answer)
    }
}

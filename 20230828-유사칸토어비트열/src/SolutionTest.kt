import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution(n = 2, left = 4, right = 17)

        assertEquals(8,result)
    }
}

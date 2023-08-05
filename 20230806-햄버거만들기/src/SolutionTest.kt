import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()

        val result = solution.solution(intArrayOf(2,1,1,2,3,1,2,3,1))

        assertEquals(2, result)
    }
}

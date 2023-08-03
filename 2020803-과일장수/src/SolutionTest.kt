import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1))

        assertEquals(8, result)
    }

    @Test
    fun solution2() {
        val solution = Solution()
        val result = solution.solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2))

        assertEquals(33, result)
    }

    @Test
    fun `이익이 발생하지 않는 경우 0을 반환한다`() {
        val solution = Solution()
        val result = solution.solution(3, 4, intArrayOf(1, 2, 1))

        assertEquals(0, result)
    }
}

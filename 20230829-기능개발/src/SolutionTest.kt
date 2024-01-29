import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30 , 5))

        assertArrayEquals(intArrayOf(2, 1), result)
    }
}

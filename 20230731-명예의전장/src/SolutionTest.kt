import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))

        assertArrayEquals(intArrayOf(10, 10, 10, 20, 20, 100, 100), result)
    }
}

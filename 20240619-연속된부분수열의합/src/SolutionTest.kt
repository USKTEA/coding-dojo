import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution(intArrayOf(1, 2, 3, 4, 5), 7)

        assertArrayEquals(
            intArrayOf(2, 3), result
        )
    }

    @Test
    fun solution_2() {
        val result = solution.solution(intArrayOf(1, 1, 1, 1, 1), 1)

        assertArrayEquals(intArrayOf(0, 0), result)
    }

    @Test
    fun solution_3() {
        val result = solution.solution(intArrayOf(1, 1, 1, 1, 1), 2)

        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun solution_4() {
        val result = solution.solution(intArrayOf(1, 1, 3, 1, 1), 3)

        assertArrayEquals(intArrayOf(2, 2), result)
    }
}

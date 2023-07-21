import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val park = arrayOf("SOO", "OOO", "OOO")
    private val routes = arrayOf("E 2", "S 2", "W 1")

    @Test
    fun solution() {
        val solution = Solution()
        val answer = solution.solution(park, routes)

        assertArrayEquals(intArrayOf(2, 1), answer)
    }
}

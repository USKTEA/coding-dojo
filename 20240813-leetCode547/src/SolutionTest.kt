import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findCircleNum() {
        val count = solution.findCircleNum(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(0, 0, 1),
            )
        )

        assertEquals(2, count)
    }
}

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simple() {
        assertArrayEquals(intArrayOf(2), solution.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
    }
}

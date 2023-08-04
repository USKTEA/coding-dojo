import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(intArrayOf(1, 3, 4, 6))

        assertEquals("1223330333221", result)
    }

    @Test
    fun removeOdd() {
        val solution = Solution()

        val removed = solution.toFoods(intArrayOf(1, 3, 4, 6))

        assertEquals(listOf(Food(1, 1), Food(2, 2), Food(3, 3)), removed)
    }

    @Test
    fun removeOdd2() {
        val solution = Solution()

        val removed = solution.toFoods(intArrayOf(1, 3, 4, 6, 7))

        assertEquals(listOf(Food(1, 1), Food(2, 2), Food(3, 3), Food(4, 3)), removed)
    }
}

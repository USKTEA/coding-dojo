import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(3, 2, 10)

        assertEquals(16, result)
    }

    @Test
    fun whenHaveLessThanA() {
        val solution = Solution()
        val result = solution.solution(5, 3, 21)

        assertEquals(27, result)
    }

    @Test
    fun change() {
        val solution = Solution()

        val (afterChange, changedAmount) = solution.exchange(2, 1, 3)

        assertEquals(2, afterChange)
        assertEquals(1, changedAmount)
    }
}

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenNIs1() {
        assertEquals(1, solution.climbStairs(1))
    }

    @Test
    fun whenNIs2() {
        assertEquals(2, solution.climbStairs(2))
    }

    @Test
    fun whenNIs3() {
        assertEquals(3, solution.climbStairs(3))
    }

    @Test
    fun whenNIs4() {
        assertEquals(5, solution.climbStairs(4))
    }

    @Test
    fun whenNIs44() {
        assertEquals(1134903170, solution.climbStairs(44))
    }
}

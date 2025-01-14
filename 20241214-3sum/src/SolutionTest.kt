import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun threeSumClosest() {
        val result = solution.threeSumClosest(arrayListOf(-1, 2, 1, -4), 1)

        assertEquals(2, result)
    }

    @Test
    fun threeSumClosest_2() {
        val result = solution.threeSumClosest(arrayListOf(1, 2, 3), 6)

        assertEquals(6, result)
    }

    @Test
    fun threeSumClosest_3() {
        val result = solution.threeSumClosest(arrayListOf(-10, -10, -10), -5)

        assertEquals(-30, result)
    }

    @Test
    fun threeSumClosest_4() {
        val result = solution.threeSumClosest(arrayListOf( 2, 1, -9, -7, -8, 2, -8, 2, 3, -8 ), -1)

        assertEquals(-2, result)
    }
}

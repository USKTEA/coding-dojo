import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun minEatingSpeed() {
        val result = solution.minEatingSpeed(intArrayOf(3, 6, 7, 11), 8)

        assertEquals(4, result)
    }

    @Test
    fun minEatingSpeed_2() {
        val result = solution.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5)

        assertEquals(30, result)
    }

    @Test
    fun minEatingSpeed_3() {
        val result = solution.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6)

        assertEquals(23, result)
    }

    @Test
    fun minEatingSpeed_4() {
        val result = solution.minEatingSpeed(intArrayOf(312884470), 312884469)

        assertEquals(2, result)
    }
}

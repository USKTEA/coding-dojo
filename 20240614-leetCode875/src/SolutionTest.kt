import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun minEatingSpeed() {
        val speed = solution.minEatingSpeed(intArrayOf(1, 2, 3), 3)

        assertEquals(3, speed)
    }

    @Test
    fun minEatingSpeed_1() {
        val speed = solution.minEatingSpeed(intArrayOf(5, 5, 10), 3)

        assertEquals(10, speed)
    }

    @Test
    fun minEatingSpeed_2() {
        val speed = solution.minEatingSpeed(intArrayOf(5, 5, 10), 4)

        assertEquals(5, speed)
    }

    @Test
    fun minEatingSpeed_3() {
        val speed = solution.minEatingSpeed(intArrayOf(3, 6, 7, 11), 8)

        assertEquals(4, speed)
    }

    @Test
    fun minEatingSpeed_4() {
        val speed = solution.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5)

        assertEquals(30, speed)
    }

    @Test
    fun minEatingSpeed_5() {
        val speed = solution.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6)

        assertEquals(23, speed)
    }

    @Test
    fun minEatingSpeed_6() {
        val speed = solution.minEatingSpeed(intArrayOf(312884470), 312884469)

        assertEquals(2, speed)
    }

}

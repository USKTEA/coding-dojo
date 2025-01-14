import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxArea() {
        val result = solution.maxArea(arrayListOf(1, 5, 4, 3))

        assertEquals(6, result)
    }

    @Test
    fun maxArea_2() {
        val result = solution.maxArea(arrayListOf(1, 5, 4, 3, 5))

        assertEquals(15, result)
    }

    @Test
    fun area_1() {
        val result = solution.area(arrayListOf(1, 10), 0, 1)

        assertEquals(1, result)
    }

    @Test
    fun area_2() {
        val result = solution.area(arrayListOf(10, 1), 0, 1)

        assertEquals(1, result)
    }

    @Test
    fun area_3() {
        val result = solution.area(arrayListOf(10, 1, 10), 0, 2)

        assertEquals(20, result)
    }
}

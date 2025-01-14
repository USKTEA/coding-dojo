import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxone() {
        val result = solution.maxone(arrayListOf(1, 1, 0, 1, 1, 0, 0, 1, 1, 1), 1)

        assertEquals(arrayListOf(0, 1, 2, 3, 4), result)
    }

    @Test
    fun maxone_2() {
        val result = solution.maxone(arrayListOf(1, 0, 0, 0, 1, 0, 1), 2)

        assertEquals(arrayListOf(3, 4, 5, 6), result)
    }

    @Test
    fun maxone_3() {
        val result = solution.maxone(arrayListOf(1, 1, 0), 2)

        assertEquals(arrayListOf(0, 1, 2), result)
    }
}

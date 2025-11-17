import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test() {
        val result = solution.solve(arrayListOf(arrayListOf(1, 2, 3), arrayListOf(2, 4, 6), arrayListOf(0, 9, 10)))

        assertEquals(arrayListOf(0, 1, 2, 2, 3, 4, 6, 9, 10), result)
    }
}

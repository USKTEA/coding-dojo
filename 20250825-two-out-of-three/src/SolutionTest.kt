import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(1, 1, 2), arrayListOf(2, 3), arrayListOf(3))

        assertEquals(arrayListOf(2, 3), result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(1, 2), arrayListOf(1, 3), arrayListOf(2, 3))

        assertEquals(arrayListOf(1, 2, 3), result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve(
            arrayListOf(56, 56, 34, 34, 72, 71),
            arrayListOf(56, 56, 34, 34, 72, 71),
            arrayListOf(56, 56, 34, 34, 72, 71)
        )

        assertEquals(arrayListOf(34, 56, 71, 72), result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve(
            arrayListOf(4, 3, 2, 1),
            arrayListOf(5, 6, 7, 8, 9),
            arrayListOf(10, 11, 1)
        )

        assertEquals(arrayListOf(1), result)
    }
}

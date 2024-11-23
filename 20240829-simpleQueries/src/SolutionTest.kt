import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            arrayListOf(1, 2, 4),
            arrayListOf(1, 2, 3, 4, 5, 6)
        )

        assertEquals(arrayListOf(8, 8, 8, 2, 2, 1), result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(
            arrayListOf(1, 3),
            arrayListOf(1)
        )

        assertEquals(arrayListOf(3), result)
    }

    @Test
    fun getSubLists() {
        val subLists = solution.getSubLists(arrayListOf(1, 2, 4))

        assertEquals(
            listOf(
                1, 2, 4, 2, 4, 4
            ), subLists
        )
    }

    @Test
    fun productByDivisors() {
        val result = solution.productByDivisors(4)

        assertEquals(8, result)
    }
}

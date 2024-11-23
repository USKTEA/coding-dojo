import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5
        )

        assertEquals(15, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(
            arrayListOf(3, 2, 2, 4, 1, 4), 3
        )

        assertEquals(6, result)
    }

    @Test
    fun getMexAndSum() {
        val maxAndSum = solution.getMexAndSum(arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

        assertEquals(Pair(10, 55), maxAndSum)
    }

    @Test
    fun search() {
        val result = solution.search(
            arrayListOf(1, 2, 3), 3, 6, 2,
        )

        assertEquals(3, result)
    }

    @Test
    fun search_2() {
        val result = solution.search(
            arrayListOf(1, 2, 3), 3, 6, 3,
        )

        assertEquals(3, result)
    }

    @Test
    fun search_3() {
        val result = solution.search(
            arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10, 55, 5,
        )

        assertEquals(15, result)
    }
}

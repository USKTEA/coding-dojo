import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            arrayListOf(1, 2, 4), arrayListOf(1, 2, 3, 4, 5, 6)
        )

        assertEquals(arrayListOf(8, 8, 8, 2, 2, 1), result)
    }

    @Test
    fun getSubListMax() {
        val maxes = solution.getSubLists(arrayListOf(1, 2, 4))

        assertEquals(mutableListOf(1, 2, 4, 2, 4, 4), maxes)
    }

    @Test
    fun getAllDivisors() {
        val divisors = solution.getAllDivisors(mutableListOf(4))

        assertEquals(
            listOf(8) , divisors
        )
    }
}

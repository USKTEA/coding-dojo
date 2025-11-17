import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test() {
        val result = solution.solve(arrayListOf(11, 3, 4, 6), 3)

        assertEquals(listOf(4, 6, 11), result)
    }

    @Test
    fun test_2() {
        val result = solution.solve(arrayListOf(11, 3, 4), 2)

        assertEquals(listOf(11, 4).sorted(), result.sorted())
    }
}

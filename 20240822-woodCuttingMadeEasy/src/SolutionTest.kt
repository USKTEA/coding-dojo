import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            arrayListOf(20, 15, 10, 17),
            7
        )

        assertEquals(15, result)
    }

    @Test
    fun solve_1() {
        val result = solution.solve(
            arrayListOf(4, 42, 40, 26, 46),
            20
        )

        assertEquals(36, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(
            arrayListOf(62, 117, 149, 85, 144, 53, 61, 72, 83, 123, 114, 91, 61, 103),
            68,
        )

        assertEquals(116, result)
    }
}

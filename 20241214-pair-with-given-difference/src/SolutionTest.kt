import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(5, 10, 3, 2, 50, 80), 78)

        assertEquals(1, result)
    }

    @Test
    fun solve_1() {
        val result = solution.solve(arrayListOf(-10, 20), 30)

        assertEquals(1, result)
    }

    @Test
    fun solve__2() {
        val result = solution.solve(arrayListOf(107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595), 699)

        assertEquals(0, result)
    }

    @Test
    fun solve__3() {
        val result = solution.solve(arrayListOf(-259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398 ), -42)

        assertEquals(1, result)
    }
}

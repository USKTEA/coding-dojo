import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("1", "one")

        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("34", "thirty-four")

        assertEquals(1, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("1234", "one-thousand-two-hundred-and-thirty-four")

        assertEquals(1, result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve("18", "eighteen-")

        assertEquals(0, result)
    }

    @Test
    fun solve_5() {
        val result = solution.solve("2560", "two-thousand-five-hundred-sixty")

        assertEquals(0, result)
    }

    @Test
    fun solve_6() {
        val result = solution.solve("1001", "one-thousand-and-one")

        assertEquals(1, result)
    }

    @Test
    fun solve_7() {
        val result = solution.solve("30", "thirty-only")

        assertEquals(0, result)
    }

    @Test
    fun solve_8() {
        val result = solution.solve("1000", "one-thousand")

        assertEquals(1, result)
    }

    @Test
    fun solve_9() {
        val result = solution.solve("1003", "one-thousand-zero-hundred-and-three")

        assertEquals(0, result)
    }
}

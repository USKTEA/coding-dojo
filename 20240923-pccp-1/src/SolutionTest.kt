import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution(
            "34:33", "13:00", "00:55", "02:55", arrayOf("next", "prev"),
        )

        assertEquals("13:00", result)
    }

    @Test
    fun solution_2() {
        val result = solution.solution(
            "10:55", "00:05", "00:15", "06:55", arrayOf("prev", "next", "next"),
        )

        assertEquals("06:55", result)
    }

    @Test
    fun solution_3() {
        val result = solution.solution(
            "07:22", "04:05", "00:15", "04:07", arrayOf("next"),
        )

        assertEquals("04:17", result)
    }

    @Test
    fun solution_4() {
        val result = solution.solution(
            "34:33", "09:50", "10:00", "13:00", arrayOf("next", "next", "next", "prev"),
        )

        assertEquals("13:10", result)
    }
}

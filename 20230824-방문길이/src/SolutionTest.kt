import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution1() {
        val result = solution.solution("ULURRDLLU")

        assertEquals(7, result)
    }

    @Test
    fun solution2() {
        val result = solution.solution("LULLLLLLU")

        assertEquals(7, result)
    }
}

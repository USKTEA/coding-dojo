import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun guessNumber() {
        val number = solution.guessNumber(2126753390)

        assertEquals(6, number)
    }

    @Test
    fun candidate() {
        val candidate = solution.candidate(1, 10)

        assertEquals(5, candidate)
    }
}

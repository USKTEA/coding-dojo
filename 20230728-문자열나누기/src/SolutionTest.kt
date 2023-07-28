import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()

        val answer = solution.solution("banana")

        assertEquals(3, answer)
    }

    @Test
    fun whenHaveElementLeft() {
        val solution = Solution()

        val answer = solution.solution("abracadabra")

        assertEquals(6, answer)
    }

    @Test
    fun solutionWithComplicateString() {
        val solution = Solution()

        val answer = solution.solution("aaabbaccccabba")

        assertEquals(3, answer)
    }
}

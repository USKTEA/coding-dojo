import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeStars() {
        val result = solution.removeStars("leet**cod*e")

        assertEquals("lecoe", result)
    }

    @Test
    fun removeStars_1() {
        val result = solution.removeStars("erase*****")

        assertEquals("", result)
    }
}

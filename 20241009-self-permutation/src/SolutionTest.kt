import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun permuteStrings() {
        val result = solution.permuteStrings("scaler", "relasc")

        assertEquals(1, result)
    }
}

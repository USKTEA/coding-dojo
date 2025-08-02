import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun letterCombinations() {
        val result = solution.letterCombinations("23")

        assertEquals(
            arrayListOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            result
        )
    }
}

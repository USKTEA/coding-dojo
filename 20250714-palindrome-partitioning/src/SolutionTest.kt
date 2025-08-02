import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {
    private val solution = Solution()

    @Test
    fun partition() {
        val result = solution.partition("aab")

        assertEquals(
            arrayListOf(
                arrayListOf("a", "a", "b"),
                arrayListOf("aa", "b"),
            ), result
        )
    }

    @ParameterizedTest
    @CsvSource(
        value = [
            "a",
            "aba",
            "aa",
            "abba"
        ]
    )
    fun isPalindrome(word: String) {
        val result = solution.isPalindrome(word)
        assertTrue(result)
    }
}

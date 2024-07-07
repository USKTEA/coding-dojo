import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun isSubsequence() {
        val result = solution.isSubsequence("a", "a")

        assertTrue(result)
    }

    @Test
    fun isSubsequence_2() {
        val result = solution.isSubsequence("ab", "a")

        assertFalse(result)
    }

    @Test
    fun isSubsequence_3() {
        val result = solution.isSubsequence("abc", "ahbgdc")

        assertTrue(result)
    }

    @Test
    fun isSubsequence_4() {
        val result = solution.isSubsequence("axc", "ahbgdc")

        assertFalse(result)
    }
}

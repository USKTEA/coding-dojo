import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `""`() {
        val result = solution.groupAnagrams(arrayOf(""))

        assertEquals(listOf(listOf("")), result)
    }

    @Test
    fun `cat, tac`() {
        val result = solution.groupAnagrams(arrayOf("cat", "tac"))

        assertEquals(listOf(listOf("cat", "tac")), result)
    }

    @Test
    fun `"", b`() {
        val result = solution.groupAnagrams(arrayOf("b", ""))

        assertEquals(listOf(listOf("b"), listOf("")), result)
    }
}

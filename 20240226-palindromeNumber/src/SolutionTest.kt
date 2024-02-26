import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun `whenXIs121`() {
        val x = 121

        val result = solution.isPalindrome(x)

        assertTrue(result)
    }

    @Test
    fun `whenXIs-121`() {
        val x = -121
        val result = solution.isPalindrome(x)

        assertFalse(result)
    }

    @Test
    fun `whenXIs10`() {
        val x = 10
        val result = solution.isPalindrome(x)

        assertFalse(result)
    }

    @Test
    fun `whenXIs1000030001`() {
        val x = 1000030001
        val result = solution.isPalindrome(x)

        assertFalse(result)
    }

    @Test
    fun getPivot() {
        val pivot = solution.getPivot(listOf(1, 2, 1))

        assertTrue(pivot == listOf(1, 1))
    }
}

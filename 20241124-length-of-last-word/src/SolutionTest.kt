import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun lengthOfLastWord() {
        val result = solution.lengthOfLastWord("hello world ")

        assertEquals(5, result)
    }

    @Test
    fun lengthOfLastWord_2() {
        val result = solution.lengthOfLastWord("InterviewBit")

        assertEquals(12, result)
    }

    @Test
    fun lengthOfLastWord_3() {
        val result = solution.lengthOfLastWord("   ")

        assertEquals(0, result)
    }
}

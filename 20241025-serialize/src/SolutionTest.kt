import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun serialize() {
        val result = solution.serialize(arrayListOf("scaler", "academy"))

        assertEquals("scaler6~academy7~", result)
    }

    @Test
    fun serialize_2() {
        val result = solution.serialize(arrayListOf("interviewbit"))

        assertEquals("interviewbit12~", result)
    }
}

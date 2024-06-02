import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val row = solution.getRow(3)

        assertEquals(arrayListOf(1, 3, 3, 1), row)
    }
}

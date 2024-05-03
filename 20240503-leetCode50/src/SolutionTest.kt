import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        assertEquals(1024.0, solution.myPow(2.0, 10))
        assertEquals(9.26100, solution.myPow(2.1, 3))
        assertEquals(0.25, solution.myPow(2.0, -2))
    }
}

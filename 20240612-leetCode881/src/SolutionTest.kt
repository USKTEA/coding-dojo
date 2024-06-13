import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.numRescueBoats(intArrayOf(1, 2), 3)

        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.numRescueBoats(intArrayOf(3,5,3,4), 5)

        assertEquals(4, result)
    }
}

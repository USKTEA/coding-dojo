import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.furthestBuilding(intArrayOf(14, 3, 19, 3), 17, 0)

        assertEquals(3, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.furthestBuilding(intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2)

        assertEquals(7, result)
    }
}

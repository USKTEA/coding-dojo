import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.findLeastNumOfUniqueInts(intArrayOf(5, 5, 4), 1)

        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.findLeastNumOfUniqueInts(intArrayOf(4, 3, 1, 1, 3, 3, 2), 3)

        assertEquals(2, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.findLeastNumOfUniqueInts(intArrayOf(2, 4, 1, 8, 3, 5, 1, 3), 3)

        assertEquals(3, result)
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun twoSum() {
        val result = solution.twoSum(arrayListOf(2, 7, 11, 15), 9)

        assertEquals(arrayListOf(1, 2), result)
    }
}

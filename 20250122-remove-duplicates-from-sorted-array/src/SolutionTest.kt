import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeDuplicates() {
        val numbers = arrayListOf(1, 1, 1, 2)
        val result = solution.removeDuplicates(numbers)

        assertEquals(3, result)
        assertEquals(arrayListOf(1, 1, 2), numbers)
    }
}

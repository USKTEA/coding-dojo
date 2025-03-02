import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeDuplicates() {
        val numbers = arrayListOf(1, 1, 2)
        val result = solution.removeDuplicates(numbers)

        assertEquals(2, result)
        assertEquals(arrayListOf(1, 2, 2), numbers)
    }

    @Test
    fun removeDuplicates2() {
        val numbers = arrayListOf(1, 2, 2, 3, 3)
        val result = solution.removeDuplicates(numbers)

        assertEquals(3, result)
        assertEquals(arrayListOf(1, 2, 3, 3, 3), numbers)
    }
}

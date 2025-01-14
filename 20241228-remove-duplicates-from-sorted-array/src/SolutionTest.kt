import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeDuplicates() {
        val numbers = arrayListOf(1, 1, 2)

        val result = solution.removeDuplicates(numbers)

        assertEquals(2, result)
        assertEquals(arrayListOf(1, 2, 0), numbers)
    }

    @Test
    fun removeDuplicates_2() {
        val numbers = arrayListOf(1, 2, 2, 3, 3)

        val result = solution.removeDuplicates(numbers)

        assertEquals(3, result)
        assertEquals(arrayListOf(1, 2, 3, 0, 0), numbers)
    }

    @Test
    fun removeDuplicates_3() {
        val numbers = arrayListOf(1, 1, 2, 2, 3, 3, 4, 4, 4, 5)

        val result = solution.removeDuplicates(numbers)

        assertEquals(5, result)
        assertEquals(arrayListOf(1, 2, 3, 4, 5, 0, 0, 0, 0, 0), numbers)
    }
}

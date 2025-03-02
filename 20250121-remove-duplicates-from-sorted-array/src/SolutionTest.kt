import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeDuplicates() {
        val result = solution.removeDuplicates(arrayListOf(1, 1, 2))

        assertEquals(2, result)
    }


    @Test
    fun removeDuplicates_2() {
        val result = solution.removeDuplicates(arrayListOf(1, 2, 2, 3, 3))

        assertEquals(3, result)
    }

    @Test
    fun removeDuplicates_3() {
        val numbers = arrayListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3)
        val result = solution.removeDuplicates(numbers)

        assertEquals(4, result)
        assertEquals(arrayListOf(0, 1, 2, 3), numbers)
    }
}

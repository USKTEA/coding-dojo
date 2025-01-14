import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun merge() {
        val numbers = arrayListOf(1, 5, 8)
        val otherNumbers = arrayListOf(6, 9)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 5, 6, 8, 9), numbers)
    }

    @Test
    fun merge_2() {
        val numbers = arrayListOf(1, 2, 3, 4, 9, 12)
        val otherNumbers = arrayListOf(6, 9, 13)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 2, 3, 4, 6, 9, 9, 12, 13), numbers)
    }
}

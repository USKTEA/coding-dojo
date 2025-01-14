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
}

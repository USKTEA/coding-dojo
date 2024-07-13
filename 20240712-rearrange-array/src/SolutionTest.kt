import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun arrange() {
        val numbers = arrayListOf(1, 0)

        solution.arrange(numbers)

        assertEquals(arrayListOf(0, 1), numbers)
    }

    @Test
    fun arrange_2() {
        val numbers = arrayListOf(0, 2, 1, 3)

        solution.arrange(numbers)

        assertEquals(arrayListOf(0, 1, 2, 3), numbers)
    }

    @Test
    fun arrange_3() {
        val numbers = arrayListOf(4, 0, 2, 1, 3)

        solution.arrange(numbers)

        assertEquals(arrayListOf(3, 4, 2, 0, 1), numbers)
    }
}

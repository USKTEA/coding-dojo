import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `intArray(0)`() {
        val numbers = intArrayOf(0)

        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(0), numbers)
    }

    @Test
    fun `intArray(0, 1)`() {
        val numbers = intArrayOf(0, 1)

        solution.moveZeroes(numbers)
        println(numbers.toList())

        assertArrayEquals(intArrayOf(1, 0), numbers)
    }

    @Test
    fun `intArray(0, 1, 0, 3, 12)`() {
        val numbers = intArrayOf(0, 1, 0, 3, 12)

        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), numbers)
    }

    @Test
    fun `intArray(0, 0, 1)`() {
        val numbers = intArrayOf(0, 0, 1)

        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(1, 0, 0), numbers)
    }
}

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun toList() {
        val list1 = solution.toList(1)
        val list2 = solution.toList(3)

        assertEquals(listOf(1), list1)
        assertEquals(listOf(1, 2, 3), list2)
    }

    @Test
    fun fizzbuzz() {
        assertEquals(listOf("1", "2", "Fizz"), solution.fizzBuzz(3))
    }
}

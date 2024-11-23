import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun countSalutes() {
        val result = solution.countSalutes("><")

        assertEquals(1, result)
    }

    @Test
    fun countSalutes_2() {
        val result = solution.countSalutes(">>><<<")

        assertEquals(9, result)
    }
}

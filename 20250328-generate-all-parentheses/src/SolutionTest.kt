import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun isValid() {
        val result = solution.isValid("()[]{}")

        assertEquals(1, result)
    }

    @Test
    fun isValid_2() {
        val result = solution.isValid("([)]")

        assertEquals(0, result)
    }

    @Test
    fun isValid_3() {
        val result = solution.isValid("(()())")

        assertEquals(1, result)
    }

    @Test
    fun isValid_4() {
        val result = solution.isValid("(()")

        assertEquals(0, result)
    }
}

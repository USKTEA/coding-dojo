import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        val result = solution.braces("((a+b))")

        assertEquals(1, result)
    }

    @Test
    fun test_2() {
        val result = solution.braces("(a+(a+b))")

        assertEquals(0, result)
    }

    @Test
    fun test_3() {
        val result = solution.braces("((a*b)+(c+d))")

        assertEquals(0, result)
    }

    @Test
    fun test_4() {
        val result = solution.braces("(d*(a+b)+c)*(d)*a+(b+c)")

        assertEquals(1, result)
    }
}

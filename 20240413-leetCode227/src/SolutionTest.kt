import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `1+1`() {
        assertEquals(2, solution.calculate("1+1"))
    }

    @Test
    fun `3+2*2`() {
        assertEquals(7, solution.calculate("3+2*2"))
    }

    @Test
    fun threeDivideByTwo() {
        assertEquals(1, solution.calculate("3/2"))
    }

    @Test
    fun threePlusFiveAndDivideByTwo() {
        assertEquals(5, solution.calculate("3+5 / 2"))
    }
}

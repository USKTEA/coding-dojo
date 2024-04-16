import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `))((`() {
        assertEquals("", solution.minRemoveToMakeValid("))(("))
    }

    @Test
    fun `lee(t(c)o)de)`() {
        assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"))
    }

    @Test
    fun `a)b(c)d`() {
        assertEquals("ab(c)d", solution.minRemoveToMakeValid("a)b(c)d"))
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun push() {
        solution.push(1)
        val stack = solution.stack

        assertTrue(stack.size == 1)
        assertTrue(stack.min == 1)
    }

    @Test
    fun pop() {
        solution.push(1)
        val stack = solution.stack

        assertTrue(stack.size == 1)
        assertTrue(stack.min == 1)

        solution.pop()

        assertTrue(stack.size == 0)
        assertTrue(stack.min == -1)
    }

    @Test
    fun top() {
        val stack = solution.stack

        assertTrue(stack.size == 0)
        assertTrue(stack.min == -1)
    }
}

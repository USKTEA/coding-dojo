import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simplifyPath() {
        val result = solution.simplifyPath("/home/")

        assertEquals("/home", result)
    }

    @Test
    fun simplifyPath_2() {
        val result = solution.simplifyPath("/home/c")

        assertEquals("/home/c", result)
    }

    @Test
    fun simplifyPath_3() {
        val result = solution.simplifyPath("/home//c")

        assertEquals("/home/c", result)
    }

    @Test
    fun simplifyPath_4() {
        val result = solution.simplifyPath("/home//c/.")

        assertEquals("/home/c", result)
    }

    @Test
    fun simplifyPath_5() {
        val result = solution.simplifyPath("/home//c/..")

        assertEquals("/home", result)
    }

    @Test
    fun removeConsecutiveSlashes() {
        val result = solution.removeConsecutiveSlashes("/////s")

        assertEquals("/s", result)
    }
}

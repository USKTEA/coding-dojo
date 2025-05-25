import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simplifyPath() {
        val path = solution.simplifyPath("/home/")

        assertEquals("/home", path)
    }

    @Test
    fun simplifyPath_2() {
        val path = solution.simplifyPath("/a/./b/../../c/")

        assertEquals("/c", path)
    }
}

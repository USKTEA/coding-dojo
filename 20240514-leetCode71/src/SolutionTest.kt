import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.simplifyPath("/home/")

        assertEquals("/home", result)
    }

    @Test
    fun test_case_2() {
        val result = solution.simplifyPath("/home/user/Documents/../Pictures")

        assertEquals("/home/user/Pictures", result)
    }

    @Test
    fun test_case_3() {
        val result = solution.simplifyPath("/home//foo/")

        assertEquals("/home/foo", result)
    }

    @Test
    fun test_case_4() {
        val result = solution.simplifyPath("/../")

        assertEquals("/", result)
    }

    @Test
    fun test_case_5() {
        val result = solution.simplifyPath("/.../a/../b/c/../d/./")

        assertEquals("/.../b/d", result)
    }

    @Test
    fun parse_simple_case_1() {
        val parsed = solution.parse("/home")

        assertEquals(
            mutableListOf("/", "home"), parsed
        )
    }

    @Test
    fun parse_simple_case_2() {
        val parsed = solution.parse("/home/")

        assertEquals(
            mutableListOf("/", "home", "/"), parsed
        )
    }

    @Test
    fun parse_simple_case_3() {
        val parsed = solution.parse("/home//foo/")

        assertEquals(
            mutableListOf("/", "home", "/", "/", "foo", "/"), parsed
        )
    }

    @Test
    fun parse_simple_case_4() {
        val parsed = solution.parse("/home/user/Documents/../Pictures")

        assertEquals(
            mutableListOf("/", "home", "/", "user", "/", "Documents", "/", "..", "/", "Pictures"), parsed
        )
    }
}

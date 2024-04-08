import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `a`() {
        assertEquals(0, solution.firstUniqChar("a"))
    }

    @Test
    fun `ab`() {
        assertEquals(0, solution.firstUniqChar("ab"))
    }

    @Test
    fun `leetcode`() {
        assertEquals(0, solution.firstUniqChar("leetcode"))
    }

    @Test
    fun `loveleetcode`() {
        assertEquals(2, solution.firstUniqChar("loveleetcode"))
    }

    @Test
    fun `aabb`() {
        assertEquals(-1, solution.firstUniqChar("aabb"))
    }
}

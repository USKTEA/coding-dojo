import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("iergxwhddh")

        assertEquals("iiiiiiiiii", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("abcabc")

        assertEquals("aaabc#", result)
    }

    @Test
    fun when_characters_only_has_one_character() {
        val result = solution.solve("a")

        assertEquals("a", result)
    }

    @Test
    fun when_characters_has_two_character() {
        val result = solution.solve("aa")

        assertEquals("a#", result)
    }
}

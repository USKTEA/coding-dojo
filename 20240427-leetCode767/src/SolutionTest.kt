import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_input_is_a() {
        assertEquals("a", solution.reorganizeString("a"))
    }

    @Test
    fun when_input_is_ab() {
        assertEquals("ab", solution.reorganizeString("ab"))
    }

    @Test
    fun when_input_is_aab() {
        assertEquals("aba", solution.reorganizeString("aab"))
    }

    @Test
    fun when_input_is_aaab() {
        assertEquals("", solution.reorganizeString("aaab"))
    }

    @Test
    fun when_input_is_aaabc() {
        assertEquals("abaca", solution.reorganizeString("aaabc"))
    }

    @Test
    fun when_input_is_baaba() {
        assertEquals("ababa", solution.reorganizeString("baaba"))
    }

    @Test
    fun when_input_isbbbbbbb() {
        assertEquals("", solution.reorganizeString("bbbbbbb"))
    }
}

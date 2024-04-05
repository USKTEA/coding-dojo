import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenWordLengthIsOne() {
        assertTrue(solution.validWordAbbreviation("a", "1"))
    }

    @Test
    fun substitution() {
        val word = "substitution"

        assertTrue(solution.validWordAbbreviation(word, "s10n"))
        assertTrue(solution.validWordAbbreviation(word, "sub4u4"))
        assertTrue(solution.validWordAbbreviation(word, "12"))
        assertTrue(solution.validWordAbbreviation(word, "su3ilu2on"))
        assertTrue(solution.validWordAbbreviation(word, "substitution"))

        assertFalse(solution.validWordAbbreviation(word, "s55n"))
        assertFalse(solution.validWordAbbreviation(word, "s010n"))
        assertFalse(solution.validWordAbbreviation(word, "s0ubstitution"))
    }

    @Test
    fun word() {
        val word = "word"

        assertFalse(solution.validWordAbbreviation(word, "3e"))
    }

    @Test
    fun hi() {
        val word = "hi"

        assertFalse(solution.validWordAbbreviation(word, "2i"))
    }

    @Test
    fun split() {
        assertEquals(listOf("a", "2", "e"), solution.split("a2e"))
        assertEquals(listOf("i", "12", "i", "z", "4", "n"), solution.split("i12iz4n"))
        assertEquals(listOf("s", "010", "n"), solution.split("s010n"))
    }
}

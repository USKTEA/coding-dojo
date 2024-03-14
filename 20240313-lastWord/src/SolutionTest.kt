import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenLengthIsOne() {
        assertEquals(1, solution.lengthOfLastWord("s"))
    }

    @Test
    fun whenLengthIsTwo() {
        assertEquals(2, solution.lengthOfLastWord("ss"))
    }

    @Test
    fun whenHaveSpace() {
        assertEquals(2, solution.lengthOfLastWord("s ss"))
    }

    @Test
    fun whenHaveTwoSpaces() {
        assertEquals(1, solution.lengthOfLastWord("s ss s"))
    }

    @Test
    fun whenSpaceAtTheLastPosition() {
        assertEquals(1, solution.lengthOfLastWord("s ss s "))
    }

}

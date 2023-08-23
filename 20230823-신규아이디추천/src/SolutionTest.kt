import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution("...!@BaT#*..y.abcdefghijklm")

        assertEquals("bat.y.abcdefghi", result)
    }

    @Test
    fun toLower() {
        val lower = solution.toLower("...!@BaT#*..y.abcdefghijklm")

        assertEquals("...!@bat#*..y.abcdefghijklm", lower)
    }

    @Test
    fun removeSpecialCharacter() {
        val removed = solution.removeSpecialCharacter("...!@bat#*..y.abcdefghijklm")

        assertEquals("...bat..y.abcdefghijklm", removed)
    }

    @Test
    fun distinctDot() {
        val distincted = solution.distinctDot("...bat..y.abcdefghijklm")

        assertEquals(".bat.y.abcdefghijklm", distincted)
    }

    @Test
    fun removeFirstAndLastDots() {
        val removed = solution.removedFirstAndLastDots(".bat.y.abcdefghijklm")

        assertEquals("bat.y.abcdefghijklm", removed)
    }

    @Test
    fun substituteWithA() {
        val substituted1 = solution.substituteWithA("")
        val substituted2 = solution.substituteWithA("bat.y.abcdefghijklm")

        assertEquals("a", substituted1)
        assertEquals("bat.y.abcdefghijklm", substituted2)
    }

    @Test
    fun sliceWithLength15() {
        val sliced = solution.sliceToLength15AndRemoveLastDot("bat.y.abcdefghijklm")

        assertEquals("bat.y.abcdefghi", sliced)
    }

    @Test
    fun repeatLastCharacter() {
        val repeated1 = solution.repeatLastCharacter("z-")
        val repeated2 = solution.repeatLastCharacter("bat.y.abcdefghi")

        assertEquals("z--", repeated1)
        assertEquals("bat.y.abcdefghi", repeated2)
    }
}

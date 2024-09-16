import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution("aukks", "wbqd", 5)

        assertEquals("happy", result)
    }

    @Test
    fun solution2() {
        val solution = Solution()
        val result = solution.solution("a", "wbqd", 5)

        assertEquals("h", result)
    }


    @Test
    fun toAsciiCodes() {
        val solution = Solution()
        val asciiCodes = solution.toAsciiCodes("ab")

        assertEquals(listOf(97, 98), asciiCodes)
    }

    @Test
    fun toSet() {
        val solution = Solution()
        val set = solution.toSet("ab")

        assertEquals(setOf(97, 98), set)
    }

    @Test
    fun addIndex() {
        val solution = Solution()
        val added = solution.addIndex(
            asciiCodes = listOf(97),
            toSkip = setOf(99),
            index = 1
        )

        assertEquals(listOf(98), added)
    }

    @Test
    fun addIndexWhenHaveToSkip() {
        val solution = Solution()
        val added = solution.addIndex(
            asciiCodes = listOf(97),
            toSkip = setOf(98),
            index = 1
        )

        assertEquals(listOf(99), added)
    }

    @Test
    fun addIndexWhenHavOutOfRange() {
        val solution = Solution()
        val added = solution.addIndex(
            asciiCodes = listOf(122),
            toSkip = setOf(97),
            index = 1
        )

        assertEquals(listOf(98), added)
    }

    @Test
    fun calculateToSkips() {
        val solution = Solution()
        val toSkips = solution.calculateToSkips(122, setOf(122))

        assertEquals(1, toSkips)
    }
}

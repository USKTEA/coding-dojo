import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `willReturn"-1"`() {
        val solution = Solution()
        val result = solution.solution("100", "2345")

        assertEquals("-1", result)
    }

    @Test
    fun `willReturn"0"`() {
        val solution = Solution()
        val result = solution.solution("100", "203045")

        assertEquals("0", result)
    }

    @Test
    fun `willReturn"10"`() {
        val solution = Solution()
        val result = solution.solution("100", "123450")

        assertEquals("10", result)
    }

    @Test
    fun `willReturn"321"`() {
        val solution = Solution()
        val result = solution.solution("12321", "42531")

        assertEquals("321", result)
    }

    @Test
    fun `willReturn"552"`() {
        val solution = Solution()
        val result = solution.solution("5525", "1255")

        assertEquals("552", result)
    }

    @Test
    fun toDictionary() {
        val solution = Solution()
        val dictionary = solution.toDictionary("100")

        assertEquals(mutableMapOf("1" to 1, "0" to 2), dictionary)
    }
}

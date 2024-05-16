import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.customSortString("cba", "abcd")

        assertEquals("cbad", result)
    }

    @Test
    fun test_case_2() {
        val result = solution.customSortString("bcafg", "abcd")

        assertEquals("bcad", result)
    }

    @Test
    fun recordOccurrence() {
        val record = solution.recordOccurrence("abcd")

        assertEquals(
            mapOf(
                'a' to listOf('a'),
                'b' to listOf('b'),
                'c' to listOf('c'),
                'd' to listOf('d')
            ), record)
    }

    @Test
    fun recordOccurrence_2() {
        val record = solution.recordOccurrence("aabcd")

        assertEquals(
            mapOf(
                'a' to listOf('a', 'a'),
                'b' to listOf('b'),
                'c' to listOf('c'),
                'd' to listOf('d')
            ), record)
    }
}

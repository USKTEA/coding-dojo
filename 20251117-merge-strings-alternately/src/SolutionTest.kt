import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun mergeAlternately_1() {
        val merged = solution.mergeAlternately("abc", "pqr")

        assertEquals("apbqcr", merged)
    }

    @Test
    fun mergeAlternately_2() {
        val merged = solution.mergeAlternately("ab", "pqrs")

        assertEquals("apbqrs", merged)
    }

    @Test
    fun mergeAlternately_3() {
        val merged = solution.mergeAlternately("abcd", "pq")

        assertEquals("apbqcd", merged)
    }
}

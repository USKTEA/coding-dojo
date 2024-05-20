import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.minSteps("bab", "aba")

        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.minSteps("leetcode", "practice")

        assertEquals(5, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.minSteps("anagram", "mangaar")

        assertEquals(0, result)
    }

    @Test
    fun count() {
        val count = solution.count("aba")

        assertEquals(
            mutableMapOf('a' to 2, 'b' to 1), count
        )
    }

    @Test
    fun differences() {
        val differences = solution.getDifferences(
            "bab",
            mutableMapOf('a' to 2, 'b' to 1)
        )

        assertEquals(1, differences)
    }
}

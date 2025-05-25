import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun specialStrings() {
        val result = solution.specialStrings(arrayListOf("ab", "cd"))

        assertEquals(arrayListOf(
            "ac", "ad", "bc", "bd"
        ), result)
    }

    @Test
    fun specialStrings_2() {
        val result = solution.specialStrings(arrayListOf("ab", "cd", "ef"))

        assertEquals(arrayListOf(
            "ace", "acf", "ade", "adf", "bce", "bcf", "bde", "bdf"
        ), result)
    }
}

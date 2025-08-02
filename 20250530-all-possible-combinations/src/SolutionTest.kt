import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun specialStrings() {
        val result = solution.specialStrings(
            words = arrayListOf(
                "ab", "cd"
            )
        )

        assertEquals(
            arrayListOf(
                "ac", "ad", "bc", "bd"
            ), result
        )
    }
}

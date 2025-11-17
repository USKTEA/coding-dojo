import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_anagrams() {
        val result = solution.anagrams(
            arrayListOf(
                "cat", "dog", "god", "tca",
            )
        )

        assertEquals(
            arrayListOf(
                arrayListOf(1, 4),
                arrayListOf(2, 3),
            ), result)
    }
}

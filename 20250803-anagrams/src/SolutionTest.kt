import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun anagrams() {
        val result = solution.anagrams(arrayListOf("cat", "dog", "god", "tca"))

        assertEquals(
            arrayListOf(
                arrayListOf(1, 4),
                arrayListOf(2, 3),
            ), result
        )
    }

    @Test
    fun anagrams_2() {
        val result = solution.anagrams(arrayListOf("rat", "tar", "art"))

        assertEquals(
            arrayListOf(
                arrayListOf(1, 2, 3),
            ), result
        )
    }
}

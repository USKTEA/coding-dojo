import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deckRevealedIncreasing() {
        val result = solution.deckRevealedIncreasing(intArrayOf(1, 1000))

        assertArrayEquals(intArrayOf(1, 1000), result)
    }

    @Test
    fun deckRevealedIncreasing_2() {
        val result = solution.deckRevealedIncreasing(intArrayOf(1, 2, 3))

        assertArrayEquals(intArrayOf(1, 3, 2), result)
    }

    @Test
    fun deckRevealedIncreasing_3() {
        val result = solution.deckRevealedIncreasing(intArrayOf(17, 13, 11, 2, 3, 5, 7))

        assertArrayEquals(intArrayOf(2, 13, 3, 11, 5, 17, 7), result)
    }
}

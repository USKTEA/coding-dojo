import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(
            lottos = intArrayOf(44, 1, 0, 0, 31, 25),
            winNumbers = intArrayOf(31, 10, 45, 1, 6, 19)
        )

        assertArrayEquals(intArrayOf(3, 5), result)
    }

    @Test
    fun match() {
        val solution = Solution()
        val matched = solution.match(
            lottos = intArrayOf(44, 1, 0, 0, 31, 25),
            winNumber = setOf(31, 10, 45, 1, 6, 19)
        )

        assertArrayEquals(intArrayOf(4, 2), matched)
    }

    @Test
    fun getRanking() {
        val solution = Solution()
        val ranking = solution.getRanking(intArrayOf(4, 2))

        assertArrayEquals(intArrayOf(3, 5), ranking)
    }
}

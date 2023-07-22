import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val answer = solution.solution(arrayOf(".#...", "..#..", "...#."))

        assertArrayEquals(intArrayOf(0, 1, 3, 4), answer)
    }

    @Test
    fun `파일이 0, 0 위치에 딱 하나만 있을 경우`() {
        val solution = Solution()
        val answer = solution.solution(arrayOf("#"))

        assertArrayEquals(intArrayOf(0, 0, 1, 1), answer)
    }

    @Test
    fun `파일이 0, 0 위치와 1, 1 위치에 있을 경우`() {
        val solution = Solution()
        val answer = solution.solution(arrayOf("#.", ".#"))

        assertArrayEquals(intArrayOf(0, 0, 2, 2), answer)
    }

    @Test
    fun calculateStart() {
        val solution = Solution()
        val start = solution.calculateStart(intArrayOf(1, 1), 0, 0)

        assertArrayEquals(intArrayOf(0, 0), start)
    }

    @Test
    fun calculateEnd() {
        val solution = Solution()
        val start = solution.calculateEnd(intArrayOf(0, 0), 0, 0)

        assertArrayEquals(intArrayOf(1, 1), start)
    }
}

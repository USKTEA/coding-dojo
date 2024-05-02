import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val score = solution.bagOfTokensScore(
            tokens = intArrayOf(100),
            power = 50
        )

        assertEquals(0, score)
    }

    @Test
    fun test_case_2() {
        val score = solution.bagOfTokensScore(
            tokens = intArrayOf(200, 100),
            power = 150
        )

        assertEquals(1, score)
    }

    @Test
    fun test_case_3() {
        val score = solution.bagOfTokensScore(
            tokens = intArrayOf(100, 200 , 300, 400),
            power = 200
        )

        assertEquals(2, score)
    }

    @Test
    fun test_case_4() {
        val score = solution.bagOfTokensScore(
            tokens = intArrayOf(10),
            power = 10
        )

        assertEquals(1, score)
    }
}

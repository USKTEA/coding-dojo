import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun willGetTCMA() {
        val solution = Solution()
        val result = solution.solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5))

        assertEquals("TCMA", result)
    }

    @Test
    fun willGetRCJA() {
        val solution = Solution()
        val result = solution.solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3))

        assertEquals("RCJA", result)
    }

    @Test
    fun getOneAnswer() {
        val solution = Solution()
        val answer = solution.answers(arrayOf("AN"), intArrayOf(5))

        assertEquals(1, answer.size)
        assertEquals("N", answer[0].type())
        assertEquals(1, answer[0].point())
    }

    @Test
    fun getTwoAnswers() {
        val solution = Solution()
        val answers = solution.answers(arrayOf("AN", "CF"), intArrayOf(5, 4))

        assertEquals(2, answers.size)

        val answer1 = answers[0]

        assertEquals("N", answer1.type())
        assertEquals(1, answer1.point())

        val answer2 = answers[1]

        assertEquals("", answer2.type())
        assertEquals(0, answer2.point())
    }
}

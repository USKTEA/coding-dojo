import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(arrayOf("aya", "yee", "u", "maa"))

        assertEquals(1, result)
    }

    @Test
    fun solution2() {
        val solution = Solution()
        val result = solution.solution(arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"))

        assertEquals(2, result)
    }
}

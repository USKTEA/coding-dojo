import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution1() {
        val cards1 = arrayOf("i", "drink", "water")
        val cards2 = arrayOf("want", "to")
        val goal = arrayOf("i", "want", "to", "drink", "water")

        val solution = Solution();
        val answer = solution.solution(cards1, cards2, goal)

        assertEquals("Yes", answer)
    }

    @Test
    fun solution2() {
        val cards1 = arrayOf("i", "water", "drink")
        val cards2 = arrayOf("want", "to")
        val goal = arrayOf("i", "want", "to", "drink", "water")

        val solution = Solution();
        val answer = solution.solution(cards1, cards2, goal)

        assertEquals("No", answer)
    }
}

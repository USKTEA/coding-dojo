import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val keymap = arrayOf("ABACD", "BCEFD")
        val targets = arrayOf("ABCD","AABB")

        val solution = Solution()
        val answer = solution.solution(keymap, targets)

        assertArrayEquals(intArrayOf(9, 4), answer)
    }

    @Test
    fun solution2() {
        val keymap = arrayOf("AA")
        val targets = arrayOf("B")

        val solution = Solution()
        val answer = solution.solution(keymap, targets)

        assertArrayEquals(intArrayOf(-1), answer)
    }

    @Test
    fun solution3() {
        val keymap = arrayOf("AGZ", "BSSS")
        val targets = arrayOf("ASA", "BGZ")

        val solution = Solution()
        val answer = solution.solution(keymap, targets)

        assertArrayEquals(intArrayOf(4, 6), answer)
    }

    @Test
    fun calculateTries() {
        val keymap = arrayOf("ABACD", "BCEFD")
        val target = "ABCD"

        val solution = Solution()
        val tries = solution.calculateTries(target, keymap)

        assertEquals(9, tries)
    }
}

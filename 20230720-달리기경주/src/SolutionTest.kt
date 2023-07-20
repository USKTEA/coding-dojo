import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val players = arrayOf("mumu", "soe", "poe", "kai", "mine");
    private val callings = arrayOf("kai", "kai", "mine", "mine")

    @Test
    fun solution() {
        val solution = Solution()
        val answer = solution.solution(players, callings)

        assertArrayEquals(answer, arrayOf("mumu", "kai", "mine", "soe", "poe"))
    }

    @Test
    fun switch() {
        val solution = Solution()

        val switched = solution.switch(players, 3)

        assertArrayEquals(switched, arrayOf("mumu", "soe", "kai", "poe", "mine"))
    }

    @Test
    fun switchTwice() {
        val solution = Solution()

        val switched = solution.switch(players, 3)
        val switchTwice = solution.switch(switched, 2)

        assertArrayEquals(switchTwice, arrayOf("mumu", "kai", "soe", "poe", "mine"))
    }
}

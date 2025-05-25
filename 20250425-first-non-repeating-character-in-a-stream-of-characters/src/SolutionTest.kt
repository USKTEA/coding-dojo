import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("abadbc")

        assertEquals("aabbdd", result)
    }

    @Test
    fun solve_1() {
        val result = solution.solve("abcabc")

        assertEquals("aaabc#", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("iergxwhddh")

        assertEquals("iiiiiiiiii", result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl")

        assertEquals("jjjjjjjjjjjjjjjjjjjjjyyyyyyyyyyyyyyyyyyyyyyyyyyyqqqqq", result)
    }
}

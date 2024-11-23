import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun hammingWeight() {
        val result = solution.hammingWeight(11)

        assertEquals(3, result)
    }
}

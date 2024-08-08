import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun cpFact() {
        val result = solution.cpFact(30, 12)

        assertEquals(5, result)
    }

    @Test
    fun dividers() {
        val dividers = solution.getDividers(30)

        assertEquals(listOf(1, 2, 3, 5, 6, 10, 15, 30), dividers)
    }

    @Test
    fun gcd() {
        val gcd = solution.gcd(4, 8)

        assertEquals(4, gcd)
    }
}

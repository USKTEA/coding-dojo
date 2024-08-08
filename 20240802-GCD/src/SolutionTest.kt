import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun gcd() {
        val result = solution.gcd(6, 9)

        assertEquals(3, result)
    }

    @Test
    fun gcd_1() {
        val result = solution.gcd(2, 4)

        assertEquals(2, result)
    }

    @Test
    fun gcd_3() {
        val result = solution.gcd(5, 10)

        assertEquals(5, result)
    }

    @Test
    fun gcd_4() {
        val result = solution.gcd(2, 8)

        assertEquals(2, result)
    }

    @Test
    fun gcd_5() {
        val result = solution.gcd(4, 8)

        assertEquals(4, result)
    }
}

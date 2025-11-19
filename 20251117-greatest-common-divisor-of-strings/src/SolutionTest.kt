import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun gcdOfStrings_1() {
        val gcd = solution.gcdOfStrings("ABCABC", "ABC")

        assertEquals("ABC", gcd)
    }

    @Test
    fun gcdOfStrings_2() {
        val gcd = solution.gcdOfStrings("ABABAB", "ABAB")

        assertEquals("AB", gcd)
    }

    @Test
    fun gcdOfStrings_3() {
        val gcd = solution.gcdOfStrings("LEET", "CODE")

        assertEquals("", gcd)
    }

    @Test
    fun getDivisors() {
        val divisors = solution.getDivisors("ABC")

        assertEquals(listOf("ABC"), divisors)
    }

    @Test
    fun getDivisors_2() {
        val divisors = solution.getDivisors("ABAB")

        assertTrue(divisors.containsAll(listOf("AB", "ABAB")))
    }

    @Test
    fun getDivisors_3() {
        val divisors = solution.getDivisors("CODE")

        assertTrue(divisors.containsAll(listOf("CODE")))
    }
}

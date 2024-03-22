import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenArrayOnlyContainsZero() {
        assertEquals(arrayListOf(1), solution.plusOne(arrayListOf(0)))
    }

    @Test
    fun whenArrayOnlyContainsOne() {
        assertEquals(arrayListOf(2), solution.plusOne(arrayListOf(1)))
    }

    @Test
    fun whenArrayContainsTwoZeros() {
        assertEquals(arrayListOf(1), solution.plusOne(arrayListOf(0, 0)))
    }

    @Test
    fun whenArrayContainsThreeZeros() {
        assertEquals(arrayListOf(1), solution.plusOne(arrayListOf(0, 0, 0)))
    }

    @Test
    fun whenArrayContainsOneAndTwo() {
        assertEquals(arrayListOf(1, 3), solution.plusOne(arrayListOf(1, 2)))
    }

    @Test
    fun whenArrayContainsNine() {
        assertEquals(arrayListOf(1, 0), solution.plusOne(arrayListOf(9)))
    }

    @Test
    fun whenArrayContainsOneAndNine() {
        assertEquals(arrayListOf(2, 0), solution.plusOne(arrayListOf(1, 9)))
    }
}

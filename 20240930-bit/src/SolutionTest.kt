import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun numSetBits() {
        val result = solution.numSetBits(11)

        assertEquals(3, result)
    }

    @Test
    fun trailingZeros() {
        val result1 = solution.trailingZeros(18)

        assertEquals(1, result1)

        val result2 = solution.trailingZeros(8)

        assertEquals(3, result2)
    }

    @Test
    fun reverse() {
        val result = solution.reverse(3)

        assertEquals(3221225472, result)
    }

    @Test
    fun singleNumber() {
        val result = solution.singleNumber(listOf(1, 2, 2, 3, 1))

        assertEquals(3, result)
    }

    @Test
    fun singleNumberThrice() {
        val result = solution.singleNumberThrice(listOf(1, 2, 4, 3, 3, 2, 2, 3, 1))

        assertEquals(4, result)
    }

    @Test
    fun findMinXor() {
        val result = solution.findMinXor(arrayListOf(0, 2, 5, 7))

        assertEquals(2, result)

        val result2 = solution.findMinXor(arrayListOf(0, 4, 7, 9))

        assertEquals(3, result2)
    }

    @Test
    fun xorSubarrays() {
        val result = solution.xorSubarrays(arrayListOf(3, 4, 5))

        println(7 or 1)
        assertEquals(6, result)
    }
}

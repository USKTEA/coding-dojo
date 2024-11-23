import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun singleNumber() {
        val result = solution.singleNumber(numbers = listOf(1, 2, 2, 3, 1))

        assertEquals(3, result)
    }

    @Test
    fun singleNumber_2() {
        val result = solution.singleNumber(numbers = listOf(1, 2, 2))

        assertEquals(1, result)
    }

    @Test
    fun singleNumber_3() {
        val result = solution.singleNumber(numbers = listOf(1, 2, 2, 1, 5))

        assertEquals(5, result)
    }

    @Test
    fun singleNumberThrice() {
        val result = solution.singleNumberThrice(listOf(0, 0, 0, 1))

        assertEquals(1, result)
    }

    @Test
    fun singleNumberThrice_2() {
        val result = solution.singleNumberThrice(listOf(1, 2, 4, 3, 3, 2, 2, 3, 1, 1))

        //0 xor 1
        //1 xor 1
        //0 xor 1
        //1

        //0 xor 1
        //1
        assertEquals(4, result)
    }
}

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.solve(arrayListOf(-6, -3, -1, 2, 4, 5))

        assertEquals(arrayListOf(1, 4, 9, 16, 25, 36), result)
    }

    @Test
    fun radix_sort_1() {
        val result = solution.radixSort(mutableListOf(3, 2, 1))

        assertEquals(mutableListOf(1, 2, 3), result)
    }

    @Test
    fun radix_sort_2() {
        val result = solution.radixSort(mutableListOf(3, 20, 1))

        assertEquals(mutableListOf(1, 3, 20), result)
    }

    @Test
    fun radix_sort_3() {
        val result = solution.radixSort(mutableListOf(69, 10, 30, 2, 16, 8, 31, 22))

        assertEquals(mutableListOf(2, 8, 10, 16, 22, 30, 31, 69), result)
    }
}

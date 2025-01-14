import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeDuplicates() {
        val numbers = arrayListOf(1, 1, 1, 2)
        val result = solution.removeDuplicates(numbers)

        assertEquals(3, result)
        assertEquals(arrayListOf(1, 1, 2), numbers)
    }

    @Test
    fun removeDuplicates_2() {
        val numbers = arrayListOf(1, 1, 1, 2, 2, 3, 3, 4)
        val result = solution.removeDuplicates(numbers)

        assertEquals(7, result)
        assertEquals(arrayListOf(1, 1, 2, 2, 3, 3, 4), numbers)
    }

    @Test
    fun removeDuplicates_3() {
        val numbers = arrayListOf(1, 2, 3)
        val result = solution.removeDuplicates(numbers)

        assertEquals(3, result)
        assertEquals(arrayListOf(1, 2, 3), numbers)
    }

    @Test
    fun removeDuplicates_4() {
        val numbers = arrayListOf(1, 1, 2, 2)
        val result = solution.removeDuplicates(numbers)

        assertEquals(4, result)
        assertEquals(arrayListOf(1, 1, 2, 2), numbers)
    }

    @Test
    fun removeDuplicates_5() {
        val numbers = arrayListOf(0)
        val result = solution.removeDuplicates(numbers)

        assertEquals(1, result)
        assertEquals(arrayListOf(0), numbers)
    }

    @Test
    fun removeDuplicates_6() {
        val numbers = arrayListOf(1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010)
        val result = solution.removeDuplicates(numbers)

        assertEquals(8, result)
        assertEquals(arrayListOf(1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010 ), numbers)
    }
}
